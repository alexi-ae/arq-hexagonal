package com.alexiae.arq.hexagonal.infrastructure.adapter.mapper;

import com.alexiae.arq.hexagonal.domain.model.Customer;
import com.alexiae.arq.hexagonal.infrastructure.adapter.entity.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerDboMapper {

  CustomerEntity toEntity(Customer customer);

  Customer toDomain(CustomerEntity entity);
}
