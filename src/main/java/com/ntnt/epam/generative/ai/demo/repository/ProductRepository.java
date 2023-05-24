package com.ntnt.epam.generative.ai.demo.repository;

import com.ntnt.epam.generative.ai.demo.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}