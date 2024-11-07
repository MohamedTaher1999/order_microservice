package org.example.application.service;

import org.example.application.port.output.OrderRepository;
import org.example.domain.Order;

import java.util.List;

public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order createOrder(Order order) {
        order.setStatus("NEW");
        return orderRepository.save(order);
    }

    public List<Order> getOrdersByUserId(Long userId) {
        return orderRepository.findAllByUserId(userId);
    }
}
