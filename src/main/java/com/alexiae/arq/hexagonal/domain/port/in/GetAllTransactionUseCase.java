package com.alexiae.arq.hexagonal.domain.port.in;

import com.alexiae.arq.hexagonal.domain.model.Transaction;

import java.util.List;

public interface GetAllTransactionUseCase {

    List<Transaction> getAllByCustomerId(Long id);
}
