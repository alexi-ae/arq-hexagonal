package com.alexiae.arq.hexagonal.infrastructure.rest;

import com.alexiae.arq.hexagonal.application.usercase.AccountService;
import com.alexiae.arq.hexagonal.domain.dto.AccountDto;
import com.alexiae.arq.hexagonal.domain.dto.request.AccountRequest;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

  @Autowired
  private AccountService accountService;

  @PostMapping
  public AccountDto create(@RequestBody AccountRequest request) {
    return accountService.create(request);
  }

  @GetMapping
  public AccountDto getById(@RequestParam Long accountId) {
    return accountService.getById(accountId);
  }

  @GetMapping("/customer/{customerId}")
  public List<AccountDto> getAllByCustomerId(@PathVariable Long customerId) {
    return accountService.getAllByCustomerId(customerId);
  }

  @DeleteMapping
  public void delete(@RequestParam Long id) {
    accountService.deleteById(id);
  }

  @PatchMapping
  public AccountDto update(@RequestBody AccountRequest request) {
    return accountService.update(request);
  }
}
