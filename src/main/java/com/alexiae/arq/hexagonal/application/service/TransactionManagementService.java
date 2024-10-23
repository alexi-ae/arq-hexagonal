package com.alexiae.arq.hexagonal.application.service;

import com.alexiae.arq.hexagonal.application.mapper.TransactionMapper;
import com.alexiae.arq.hexagonal.application.usercase.TransactionService;
import com.alexiae.arq.hexagonal.domain.dto.TransactionDto;
import com.alexiae.arq.hexagonal.domain.dto.request.TransactionRequest;
import com.alexiae.arq.hexagonal.domain.port.TransactionPersistencePort;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionManagementService implements TransactionService {

  @Autowired
  private TransactionPersistencePort transactionPersistencePort;

  @Autowired
  private TransactionMapper transactionMapper;

  @Override
  public TransactionDto create(TransactionRequest request) {
    var transaction = transactionPersistencePort.create(transactionMapper.toDomain(request));
    return transactionMapper.toDto(transaction);
  }

  @Override
  public TransactionDto getById(Long id) {
    return transactionMapper.toDto(transactionPersistencePort.getById(id));
  }

  @Override
  public List<TransactionDto> getAllByCustomerId(Long id) {
    return transactionPersistencePort.getAllByCustomerId(id).stream()
        .map(transactionMapper::toDto)
        .toList();
  }

  @Override
  public void deleteById(Long id) {
    transactionPersistencePort.deleteById(id);
  }

  @Override
  public TransactionDto update(TransactionRequest request) {
    var transaction = transactionPersistencePort.create(transactionMapper.toDomain(request));
    return transactionMapper.toDto(transaction);
  }
}
