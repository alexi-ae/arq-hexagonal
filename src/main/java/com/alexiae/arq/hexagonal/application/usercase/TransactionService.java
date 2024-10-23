package com.alexiae.arq.hexagonal.application.usercase;

import com.alexiae.arq.hexagonal.domain.dto.TransactionDto;
import com.alexiae.arq.hexagonal.domain.dto.request.TransactionRequest;
import java.util.List;

public interface TransactionService {

  TransactionDto create(TransactionRequest request);

  TransactionDto getById(Long id);

  List<TransactionDto> getAllByCustomerId(Long id);

  void deleteById(Long id);

  TransactionDto update(TransactionRequest request);
}
