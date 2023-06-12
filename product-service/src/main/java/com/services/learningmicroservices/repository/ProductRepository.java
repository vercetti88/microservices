package com.services.learningmicroservices.repository;

import com.services.learningmicroservices.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
