package com.ntnt.epam.generative.ai.demo.repository;

import com.ntnt.epam.generative.ai.demo.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {
}