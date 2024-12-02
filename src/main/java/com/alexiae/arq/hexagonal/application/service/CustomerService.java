package com.alexiae.arq.hexagonal.application.service;

import com.alexiae.arq.hexagonal.application.dto.CustomerDto;
import com.alexiae.arq.hexagonal.application.dto.request.CustomerRequest;

public interface CustomerService {

    CustomerDto create(CustomerRequest request);

    CustomerDto update(CustomerRequest request);
}
