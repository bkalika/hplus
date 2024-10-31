package com.bkalika.gql.hplus.controller;

import com.bkalika.gql.hplus.data.Order;
import com.bkalika.gql.hplus.data.OrderRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class OrderController {
    private final OrderRepository orderRepository;

    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @QueryMapping
    public Iterable<Order> orders() {
        return orderRepository.findAll();
    }

    @QueryMapping
    public Order orderById(@Argument(name = "id") String id) {
        return this.orderRepository.findById(id).orElse(null);
    }
}
