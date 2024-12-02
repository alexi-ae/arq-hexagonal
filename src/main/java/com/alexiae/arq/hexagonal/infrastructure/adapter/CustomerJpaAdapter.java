package com.alexiae.arq.hexagonal.infrastructure.adapter;

import com.alexiae.arq.hexagonal.domain.model.Customer;
import com.alexiae.arq.hexagonal.domain.port.out.CustomerPersistencePort;
import com.alexiae.arq.hexagonal.infrastructure.adapter.entity.CustomerEntity;
import com.alexiae.arq.hexagonal.infrastructure.adapter.mapper.CustomerDboMapper;
import com.alexiae.arq.hexagonal.infrastructure.adapter.repository.CustomerRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CustomerJpaAdapter implements CustomerPersistencePort {

  @Autowired
  private CustomerRepository customerRepository;

  @Autowired
  private CustomerDboMapper customerDboMapper;

  @Override
  public Customer create(Customer request) {
    CustomerEntity customerEntity =
        customerRepository.save(customerDboMapper.toEntity(request));
    return customerDboMapper.toDomain(customerEntity);
  }

  @Override
  public Customer getById(Long id) {
    CustomerEntity customerEntity = customerRepository.findById(id)
        .orElseThrow(() -> new IllegalArgumentException("Customer not found"));
    return customerDboMapper.toDomain(customerEntity);
  }

  @Override
  public void deleteById(Long id) {
    customerRepository.deleteById(id);
  }

  @Override
  public Customer update(Customer request) {
    CustomerEntity customerEntity =
        customerRepository.save(customerDboMapper.toEntity(request));
    return customerDboMapper.toDomain(customerEntity);
  }
}
