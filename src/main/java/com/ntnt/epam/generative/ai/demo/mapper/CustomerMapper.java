package com.ntnt.epam.generative.ai.demo.mapper;

// Help me generate CustomerMapper.java using Mapstruct to map CustomerCreateReq to CustomerEntity.
import com.ntnt.epam.generative.ai.demo.dto.request.CustomerCreateReq;
import com.ntnt.epam.generative.ai.demo.dto.request.CustomerUpdateReq;
import com.ntnt.epam.generative.ai.demo.entity.CustomerEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface CustomerMapper {

  CustomerEntity toCustomerEntity(CustomerCreateReq customerCreateReq);

  CustomerEntity toCustomerEntity(CustomerUpdateReq customerUpdateReq, @MappingTarget CustomerEntity customerEntity);
}


