package com.alexiae.arq.hexagonal.application.usercase;

import com.alexiae.arq.hexagonal.domain.model.Customer;
import com.alexiae.arq.hexagonal.domain.port.in.CreateCustomerUseCase;
import com.alexiae.arq.hexagonal.domain.port.out.CustomerPersistencePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateCustomerUseCaseImpl implements CreateCustomerUseCase {

    @Autowired
    private CustomerPersistencePort customerPersistencePort;

    @Override
    public Customer create(Customer customer) {
        return customerPersistencePort.create(customer);
    }
}
