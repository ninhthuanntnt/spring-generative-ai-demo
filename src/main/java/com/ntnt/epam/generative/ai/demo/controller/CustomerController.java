package com.ntnt.epam.generative.ai.demo.controller;

// Please help me generate CustomerController using spring boot rest controller which has 4 endpoints CRUD
// and using CustomerService to handle business logic. And using CustomerMapper to map entity to CustomerRes before
// return.

import com.ntnt.epam.generative.ai.demo.dto.request.CustomerCreateReq;
import com.ntnt.epam.generative.ai.demo.dto.response.CustomerRes;
import com.ntnt.epam.generative.ai.demo.dto.request.CustomerUpdateReq;
import com.ntnt.epam.generative.ai.demo.mapper.CustomerMapper;
import com.ntnt.epam.generative.ai.demo.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customers")
@RequiredArgsConstructor
public class CustomerController {

  private final CustomerService customerService;

  @GetMapping
  public ResponseEntity<List<CustomerRes>> getAllCustomer() {
    return ResponseEntity.ok(CustomerMapper.INSTANCE.toCustomerRes(customerService.findAll()));
  }

  @GetMapping("/{id}")
  public ResponseEntity<CustomerRes> getCustomerById(@PathVariable("id") Long id) {
    return ResponseEntity.ok(CustomerMapper.INSTANCE.toCustomerRes(customerService.findById(id)));
  }

  @PostMapping
  public ResponseEntity<CustomerRes> createCustomer(@RequestBody CustomerCreateReq customerCreateReq) {
    return ResponseEntity.ok(CustomerMapper.INSTANCE.toCustomerRes(customerService.insert(customerCreateReq)));
  }

  @PutMapping("/{id}")
  public ResponseEntity<CustomerRes> updateCustomer(@PathVariable("id") Long id,
                                                    @RequestBody CustomerUpdateReq customerUpdateReq) {
    return ResponseEntity.ok(CustomerMapper.INSTANCE.toCustomerRes(customerService.update(id, customerUpdateReq)));
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> deleteCustomer(@PathVariable("id") Long id) {
    customerService.delete(id);
    return ResponseEntity.ok().build();
  }
}