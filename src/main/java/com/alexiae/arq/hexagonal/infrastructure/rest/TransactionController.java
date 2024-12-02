package com.alexiae.arq.hexagonal.infrastructure.rest;

import com.alexiae.arq.hexagonal.application.dto.TransactionDto;
import com.alexiae.arq.hexagonal.application.dto.request.TransactionRequest;
import com.alexiae.arq.hexagonal.application.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping
    public TransactionDto create(@RequestBody TransactionRequest request) {
        return transactionService.create(request);
    }


    @GetMapping("/customer/{customerId}")
    public List<TransactionDto> getAllByCustomerId(@PathVariable Long customerId) {
        return transactionService.getAllByCustomerId(customerId);
    }
}
