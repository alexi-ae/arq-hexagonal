package com.alexiae.arq.hexagonal.application.usercase;

import com.alexiae.arq.hexagonal.domain.model.Transaction;
import com.alexiae.arq.hexagonal.domain.port.in.CreateTransactionUseCase;
import com.alexiae.arq.hexagonal.domain.port.out.TransactionPersistencePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateTransactionUseCaseImpl implements CreateTransactionUseCase {

    @Autowired
    private TransactionPersistencePort transactionPersistencePort;

    @Override
    public Transaction create(Transaction transaction) {

        return transactionPersistencePort.create(transaction);
    }
}
