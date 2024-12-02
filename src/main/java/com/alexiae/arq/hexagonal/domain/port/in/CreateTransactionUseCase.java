package com.alexiae.arq.hexagonal.domain.port.in;

import com.alexiae.arq.hexagonal.domain.model.Transaction;

public interface CreateTransactionUseCase {
    Transaction create(Transaction transaction);
}
