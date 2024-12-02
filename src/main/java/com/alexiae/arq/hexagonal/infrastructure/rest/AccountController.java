package com.alexiae.arq.hexagonal.infrastructure.rest;

import com.alexiae.arq.hexagonal.application.dto.AccountDto;
import com.alexiae.arq.hexagonal.application.dto.request.AccountRequest;
import com.alexiae.arq.hexagonal.application.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping
    public AccountDto create(@RequestBody AccountRequest request) {
        return accountService.create(request);
    }

    @GetMapping("/customer/{customerId}")
    public List<AccountDto> getAllByCustomerId(@PathVariable Long customerId) {
        return accountService.getAllByCustomerId(customerId);
    }

    @PatchMapping
    public AccountDto update(@RequestBody AccountRequest request) {
        return accountService.update(request);
    }
}
