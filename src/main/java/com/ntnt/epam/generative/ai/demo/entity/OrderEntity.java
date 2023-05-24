package com.ntnt.epam.generative.ai.demo.entity;

// Generate OrderEntity which includes id (Long), customerId, customerName, productId, amount (BigDecimal) and
// orderDate (Instant). Using Hibernate and Lombok. With a rule is that the name of the table use in plural form. And
// use @Column to map camelCase to snake_case. productId is id from ProductEntity and customerId is id from
// CustomerEntity.

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "orders")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(name = "customer_id")
  private Long customerId;
  @Column(name = "customer_name")
  private String customerName;
  @Column(name = "product_id")
  private int productId;
  private BigDecimal amount;
  @Column(name = "order_date")
  private Instant orderDate;

  @ManyToOne
  @JoinColumn(name = "customer_id")
  private CustomerEntity customer;

  @ManyToOne
  @JoinColumn(name = "product_id")
  private ProductEntity product;
}