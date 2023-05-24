package com.ntnt.epam.generative.ai.demo.repository;

import com.ntnt.epam.generative.ai.demo.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
}