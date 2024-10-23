package com.alexiae.arq.hexagonal.infrastructure.rest;

import com.alexiae.arq.hexagonal.application.usercase.CustomerService;
import com.alexiae.arq.hexagonal.domain.dto.CustomerDto;
import com.alexiae.arq.hexagonal.domain.dto.request.CustomerRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

  @Autowired
  private CustomerService customerService;

  @PostMapping
  public CustomerDto create(@RequestBody CustomerRequest request) {
    return customerService.create(request);
  }

  @GetMapping
  public CustomerDto getById(@RequestParam Long customerId) {
    return customerService.getById(customerId);
  }

  @DeleteMapping
  public void delete(@RequestParam Long id) {
    customerService.deleteById(id);
  }

  @PatchMapping
  public CustomerDto update(@RequestBody CustomerRequest request) {
    return customerService.update(request);
  }
}
