package com.alexiae.arq.hexagonal.application.service.impl;

import com.alexiae.arq.hexagonal.application.dto.TransactionDto;
import com.alexiae.arq.hexagonal.application.dto.request.TransactionRequest;
import com.alexiae.arq.hexagonal.application.mapper.TransactionMapper;
import com.alexiae.arq.hexagonal.application.service.TransactionService;
import com.alexiae.arq.hexagonal.domain.port.in.CreateTransactionUseCase;
import com.alexiae.arq.hexagonal.domain.port.in.GetAllTransactionUseCase;
import com.alexiae.arq.hexagonal.domain.port.out.TransactionPersistencePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private CreateTransactionUseCase createTransactionUseCase;

    @Autowired
    private GetAllTransactionUseCase getAllTransactionUseCase;

    @Autowired
    private TransactionMapper transactionMapper;

    @Override
    public TransactionDto create(TransactionRequest request) {
        var transaction = createTransactionUseCase.create(transactionMapper.toDomain(request));
        return transactionMapper.toDto(transaction);
    }

    @Override
    public List<TransactionDto> getAllByCustomerId(Long id) {
        return getAllTransactionUseCase.getAllByCustomerId(id).stream()
                .map(transactionMapper::toDto)
                .toList();
    }
}
