package com.services.learningmicroservices.service;


import com.services.learningmicroservices.dto.ProductRequest;
import com.services.learningmicroservices.dto.ProductResponse;
import com.services.learningmicroservices.model.Product;
import com.services.learningmicroservices.repository.ProductRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
@Transactional
public class ProductService {

    private final ModelMapper modelMapper;

    private final ProductRepository productRepository;

    public void createProduct(ProductRequest productRequest) {
        Product product = modelMapper.map(productRequest, Product.class);
        productRepository.save(product);
        log.info("Product is saved: {}", product.getId());
    }

    public List<ProductResponse> getProducts() {
        return productRepository.findAll().stream()
                .map(x-> modelMapper.map(x, ProductResponse.class))
                .collect(Collectors.toList());
    }
}
