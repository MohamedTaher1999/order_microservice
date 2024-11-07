package org.example.application.port.output;

import org.example.domain.Order;

import java.util.List;
import java.util.Optional;

public interface OrderRepository {
    Order save(Order order);
    Optional<Order> findById(Long id);
    List<Order> findAllByUserId(Long userId);
}