package com.ntnt.epam.generative.ai.demo.service;
// Please help me to create product service which has methods similar with CustomerService and should have log info on
// each method.
import com.ntnt.epam.generative.ai.demo.dto.request.ProductCreateReq;
import com.ntnt.epam.generative.ai.demo.dto.request.ProductRes;
import com.ntnt.epam.generative.ai.demo.dto.request.ProductUpdateReq;
import com.ntnt.epam.generative.ai.demo.entity.ProductEntity;
import com.ntnt.epam.generative.ai.demo.mapper.ProductMapper;
import com.ntnt.epam.generative.ai.demo.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
  private final ProductRepository productRepository;
  private final ProductMapper productMapper;

  public ProductService(ProductRepository productRepository, ProductMapper productMapper) {
    this.productRepository = productRepository;
    this.productMapper = productMapper;
  }

  public ProductRes create(ProductCreateReq productCreateReq) {
    ProductEntity productEntity = productMapper.toProductEntity(productCreateReq);
    productRepository.save(productEntity);
    return productMapper.toProductRes(productEntity);
  }

  public ProductRes update(ProductUpdateReq productUpdateReq) {
    ProductEntity productEntity = productRepository.findById(productUpdateReq.getId()).orElse(null);
    if (productEntity == null) return null;
    productMapper.toProductEntity(productUpdateReq, productEntity);
    productRepository.save(productEntity);
    return productMapper.toProductRes(productEntity);
  }

  public ProductRes get(Long id) {
    ProductEntity productEntity = productRepository.findById(id).orElse(null);
    if (productEntity == null) return null;
    return productMapper.toProductRes(productEntity);
  }

  public List<ProductRes> getAll() {
    return productMapper.toProductRes(productRepository.findAll());
  }

  public void delete(Long id) {
    ProductEntity productEntity = productRepository.findById(id).orElse(null);
    if (productEntity == null) return;
    productRepository.delete(productEntity);
  }
}
//