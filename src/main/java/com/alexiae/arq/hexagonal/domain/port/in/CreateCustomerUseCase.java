package com.alexiae.arq.hexagonal.domain.port.in;

import com.alexiae.arq.hexagonal.domain.model.Customer;

public interface CreateCustomerUseCase {
    Customer create(Customer customer);
}
