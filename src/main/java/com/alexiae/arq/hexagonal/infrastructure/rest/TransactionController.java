package com.alexiae.arq.hexagonal.infrastructure.rest;

import com.alexiae.arq.hexagonal.application.usercase.TransactionService;
import com.alexiae.arq.hexagonal.domain.dto.TransactionDto;
import com.alexiae.arq.hexagonal.domain.dto.request.TransactionRequest;
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
@RequestMapping("/api/transactions")
public class TransactionController {

  @Autowired
  private TransactionService transactionService;

  @PostMapping
  public TransactionDto create(@RequestBody TransactionRequest request) {
    return transactionService.create(request);
  }

  @GetMapping
  public TransactionDto getById(@RequestParam Long accountId) {
    return transactionService.getById(accountId);
  }

  @GetMapping("/customer/{customerId}")
  public List<TransactionDto> getAllByCustomerId(@PathVariable Long customerId) {
    return transactionService.getAllByCustomerId(customerId);
  }

  @DeleteMapping
  public void delete(@RequestParam Long id) {
    transactionService.deleteById(id);
  }

  @PatchMapping
  public TransactionDto update(@RequestBody TransactionRequest request) {
    return transactionService.update(request);
  }
}
