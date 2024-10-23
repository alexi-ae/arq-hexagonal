package com.alexiae.arq.hexagonal.application.service;

import com.alexiae.arq.hexagonal.application.mapper.CustomerMapper;
import com.alexiae.arq.hexagonal.application.usercase.CustomerService;
import com.alexiae.arq.hexagonal.domain.dto.CustomerDto;
import com.alexiae.arq.hexagonal.domain.dto.request.CustomerRequest;
import com.alexiae.arq.hexagonal.domain.port.CustomerPersistencePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerManagementService implements CustomerService {

  @Autowired
  private CustomerPersistencePort customerPersistencePort;

  @Autowired
  private CustomerMapper customerMapper;

  @Override
  public CustomerDto create(CustomerRequest request) {
    var customer = customerPersistencePort.create(customerMapper.toDomain(request));
    return customerMapper.toDto(customer);
  }

  @Override
  public CustomerDto getById(Long id) {
    return customerMapper.toDto(customerPersistencePort.getById(id));
  }

  @Override
  public void deleteById(Long id) {
    customerPersistencePort.deleteById(id);
  }

  @Override
  public CustomerDto update(CustomerRequest request) {
    var customer = customerPersistencePort.update(customerMapper.toDomain(request));
    return customerMapper.toDto(customer);
  }
}
