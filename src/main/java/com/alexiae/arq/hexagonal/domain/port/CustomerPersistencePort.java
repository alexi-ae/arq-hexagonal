package com.alexiae.arq.hexagonal.domain.port;

import com.alexiae.arq.hexagonal.domain.model.Customer;

public interface CustomerPersistencePort {

  Customer create(Customer request);

  Customer getById(Long id);

  void deleteById(Long id);

  Customer update(Customer request);
}
