package com.alexiae.arq.hexagonal.application.service;

import com.alexiae.arq.hexagonal.application.dto.TransactionDto;
import com.alexiae.arq.hexagonal.application.dto.request.TransactionRequest;

import java.util.List;

public interface TransactionService {

    TransactionDto create(TransactionRequest request);

    List<TransactionDto> getAllByCustomerId(Long id);
}
