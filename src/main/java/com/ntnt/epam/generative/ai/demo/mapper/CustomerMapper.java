package com.ntnt.epam.generative.ai.demo.mapper;

// Please help me generate CustomerMapper using Mapstruct to map CustomerCreateReq to CustomerEntity and ignore null

import com.ntnt.epam.generative.ai.demo.dto.request.CustomerCreateReq;
import com.ntnt.epam.generative.ai.demo.dto.response.CustomerRes;
import com.ntnt.epam.generative.ai.demo.dto.request.CustomerUpdateReq;
import com.ntnt.epam.generative.ai.demo.entity.CustomerEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CustomerMapper {
  CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

  CustomerEntity toCustomerEntity(CustomerCreateReq customerCreateReq);

  CustomerRes toCustomerRes(CustomerEntity customerEntity);

  List<CustomerRes> toCustomerRes(List<CustomerEntity> customerEntities);

  CustomerEntity toCustomerEntity(CustomerUpdateReq customerUpdateReq, @MappingTarget CustomerEntity customerEntity);
}



