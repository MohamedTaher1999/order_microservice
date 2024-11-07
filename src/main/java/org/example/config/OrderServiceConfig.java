package org.example.config;

import org.example.adapter.persistence.OrderRepositoryImpl;
import org.example.application.port.output.OrderRepository;
import org.example.application.service.OrderService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrderServiceConfig {

    @Bean
    public OrderService orderService(OrderRepository orderRepository) {
        return new OrderService(orderRepository);
    }

    @Bean
    public OrderRepository orderRepository(OrderRepositoryImpl orderRepositoryImpl) {
        return orderRepositoryImpl;
    }
}