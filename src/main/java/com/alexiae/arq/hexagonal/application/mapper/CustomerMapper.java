package com.alexiae.arq.hexagonal.application.mapper;

import com.alexiae.arq.hexagonal.application.dto.CustomerDto;
import com.alexiae.arq.hexagonal.application.dto.request.CustomerRequest;
import com.alexiae.arq.hexagonal.domain.model.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

  Customer toDomain(CustomerRequest request);

  CustomerDto toDto(Customer account);
}
