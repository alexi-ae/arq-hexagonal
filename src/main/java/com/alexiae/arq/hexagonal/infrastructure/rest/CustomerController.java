package com.alexiae.arq.hexagonal.infrastructure.rest;

import com.alexiae.arq.hexagonal.application.dto.CustomerDto;
import com.alexiae.arq.hexagonal.application.dto.request.CustomerRequest;
import com.alexiae.arq.hexagonal.application.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping
    public CustomerDto create(@RequestBody CustomerRequest request) {
        return customerService.create(request);
    }

    @PatchMapping
    public CustomerDto update(@RequestBody CustomerRequest request) {
        return customerService.update(request);
    }

}
