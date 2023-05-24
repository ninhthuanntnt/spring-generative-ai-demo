package com.ntnt.epam.generative.ai.demo.entity;
// Generate ProductEntity which have id (Long), name, price (BigDecimal), and type (Enum). Using
// Hibernate and Lombok. With a rule is that the name of the table use in plural form. and use @Column to map
// camelCase to snake_case

import com.ntnt.epam.generative.ai.demo.entity.constant.ProductType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "products")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private BigDecimal price;
  @Enumerated(EnumType.STRING)
  private ProductType type;
}
