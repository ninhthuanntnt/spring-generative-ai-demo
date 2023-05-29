package com.ntnt.epam.generative.ai.demo.service;

// Create CustomerService which support CRUD operations on CustomerEntity and add log.info() to every method. and
// don't use DTO in the service layer.

import com.ntnt.epam.generative.ai.demo.dto.request.CustomerCreateReq;
import com.ntnt.epam.generative.ai.demo.dto.request.CustomerUpdateReq;
import com.ntnt.epam.generative.ai.demo.entity.CustomerEntity;
import com.ntnt.epam.generative.ai.demo.exception.NotFoundException;
import com.ntnt.epam.generative.ai.demo.exception.constant.ErrorCode;
import com.ntnt.epam.generative.ai.demo.mapper.CustomerMapper;
import com.ntnt.epam.generative.ai.demo.repository.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

  private static final Logger log = LoggerFactory.getLogger(CustomerService.class);

  @Autowired
  private CustomerRepository customerRepository;

  public List<CustomerEntity> findAll() {
    log.info("Find all customers");
    return customerRepository.findAll();
  }

  public CustomerEntity findById(Long id) {
    log.info("Find customer by id: {}", id);
    return customerRepository.findById(id).orElseThrow(() -> new NotFoundException(ErrorCode.CUS_0000));
  }

  public CustomerEntity update(Long id, CustomerUpdateReq customer) {
    log.info("Update customer with id: {}", id);
    CustomerEntity dbCustomer = customerRepository.findById(id)
                                                  .orElseThrow(() -> new NotFoundException(ErrorCode.CUS_0000));

    return customerRepository.save(CustomerMapper.INSTANCE.toCustomerEntity(customer, dbCustomer));
  }

  public CustomerEntity insert(CustomerCreateReq customer) {
    log.info("Insert customer");

    return customerRepository.save(CustomerMapper.INSTANCE.toCustomerEntity(customer));
  }

  public void delete(Long id) {
    log.info("Delete customer");
    customerRepository.deleteById(id);
  }
}
