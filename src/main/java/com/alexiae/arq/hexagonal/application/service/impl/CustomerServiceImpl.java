package com.alexiae.arq.hexagonal.application.service.impl;

import com.alexiae.arq.hexagonal.application.dto.CustomerDto;
import com.alexiae.arq.hexagonal.application.dto.request.CustomerRequest;
import com.alexiae.arq.hexagonal.application.mapper.CustomerMapper;
import com.alexiae.arq.hexagonal.application.service.CustomerService;
import com.alexiae.arq.hexagonal.domain.port.in.CreateCustomerUseCase;
import com.alexiae.arq.hexagonal.domain.port.in.UpdateCustomerUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CreateCustomerUseCase createCustomerUseCase;

    @Autowired
    private UpdateCustomerUseCase updateCustomerUseCase;

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public CustomerDto create(CustomerRequest request) {
        var customer = createCustomerUseCase.create(customerMapper.toDomain(request));
        return customerMapper.toDto(customer);
    }

    @Override
    public CustomerDto update(CustomerRequest request) {
        var customer = updateCustomerUseCase.update(request.getId(), customerMapper.toDomain(request));
        return customerMapper.toDto(customer);
    }
}
