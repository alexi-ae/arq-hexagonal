package com.alexiae.arq.hexagonal.application.usercase;

import com.alexiae.arq.hexagonal.domain.dto.CustomerDto;
import com.alexiae.arq.hexagonal.domain.dto.request.CustomerRequest;

public interface CustomerService {

  CustomerDto create(CustomerRequest request);

  CustomerDto getById(Long id);

  void deleteById(Long id);

  CustomerDto update(CustomerRequest request);
}
