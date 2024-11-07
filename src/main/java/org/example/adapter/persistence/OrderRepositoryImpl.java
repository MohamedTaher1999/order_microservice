package org.example.adapter.persistence;

import org.example.application.port.output.OrderRepository;
import org.example.domain.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class OrderRepositoryImpl implements OrderRepository {

    private final OrderJpaRepository orderJpaRepository;

    @Autowired
    public OrderRepositoryImpl(OrderJpaRepository orderJpaRepository) {
        this.orderJpaRepository = orderJpaRepository;
    }

    @Override
    public Order save(Order order) {
        return orderJpaRepository.save(order);
    }

    @Override
    public Optional<Order> findById(Long id) {
        return orderJpaRepository.findById(id);
    }

    @Override
    public List<Order> findAllByUserId(Long userId) {
        return orderJpaRepository.findAllByUserId(userId);
    }
}
