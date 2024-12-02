package com.alexiae.arq.hexagonal.domain.port.in;

import com.alexiae.arq.hexagonal.domain.model.Customer;

public interface UpdateCustomerUseCase {

    Customer update(Long id, Customer customer);
}
