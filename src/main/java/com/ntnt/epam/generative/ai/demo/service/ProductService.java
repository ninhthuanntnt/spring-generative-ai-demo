package com.ntnt.epam.generative.ai.demo.service;
// Create ProductService with rules follow CustomerService
import com.ntnt.epam.generative.ai.demo.entity.ProductEntity;
import com.ntnt.epam.generative.ai.demo.exception.NotFoundException;
import com.ntnt.epam.generative.ai.demo.exception.constant.ErrorCode;
import com.ntnt.epam.generative.ai.demo.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public List<ProductEntity> findAll() {
        return productRepository.findAll();
    }

    public ProductEntity findById(Long id) {
        return productRepository.findById(id).orElseThrow(() -> new NotFoundException(ErrorCode.PRODUCT_NOT_FOUND));
    }

    public ProductEntity create(ProductEntity productEntity) {
        return productRepository.save(productEntity);
    }

    public ProductEntity update(Long id, ProductEntity productEntity) {
        ProductEntity existProduct = findById(id);
        existProduct.setName(productEntity.getName());
        existProduct.setPrice(productEntity.getPrice());
        return productRepository.save(existProduct);
    }

    public void delete(Long id) {
        ProductEntity existProduct = findById(id);
        productRepository.delete(existProduct);
    }
}