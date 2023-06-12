package com.m46.orderservice.service;


import com.m46.orderservice.dto.OrderRequest;
import com.m46.orderservice.model.Order;
import com.m46.orderservice.model.OrderLineItems;
import com.m46.orderservice.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    private final ModelMapper modelMapper;
    public void placeOrder(OrderRequest orderRequest) {
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());

        List<OrderLineItems> orderLineItemsList = orderRequest
                .getOrderLineItemsList().stream()
                .map(dto -> modelMapper.map(dto, OrderLineItems.class))
                .toList();

        order.setOrderLineItemsList(orderLineItemsList);

        orderRepository.save(order);
    }
}
