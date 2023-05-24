package com.ntnt.epam.generative.ai.demo.entity;
// Generate ProductEntity which have id (Long), name, address, and phoneNumber. Using Hibernate
// and Lombok. With a rule is that the name of the table use in plural form. and use @Column to map camelCase to snake_case

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String address;
  @Column(name = "phone_number")
  private String phoneNumber;
}