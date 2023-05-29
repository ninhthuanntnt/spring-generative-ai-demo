package com.ntnt.epam.generative.ai.demo.mapper;

// Create ProductMapper interface similar with CustomerMapper.

import com.ntnt.epam.generative.ai.demo.dto.request.ProductCreateReq;
import com.ntnt.epam.generative.ai.demo.dto.response.ProductRes;
import com.ntnt.epam.generative.ai.demo.dto.request.ProductUpdateReq;
import com.ntnt.epam.generative.ai.demo.entity.ProductEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProductMapper {
  ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

  ProductEntity toProductEntity(ProductCreateReq productCreateReq);

  ProductRes toProductRes(ProductEntity productEntity);

  List<ProductRes> toProductRes(List<ProductEntity> productEntities);

  ProductEntity toProductEntity(ProductUpdateReq productUpdateReq, @MappingTarget ProductEntity productEntity);
}
