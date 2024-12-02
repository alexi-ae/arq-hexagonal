package com.alexiae.arq.hexagonal.application.usercase;

import com.alexiae.arq.hexagonal.domain.model.Transaction;
import com.alexiae.arq.hexagonal.domain.port.in.GetAllTransactionUseCase;
import com.alexiae.arq.hexagonal.domain.port.out.TransactionPersistencePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetAllTransactionUseCaseImpl implements GetAllTransactionUseCase {

    @Autowired
    private TransactionPersistencePort transactionPersistencePort;

    @Override
    public List<Transaction> getAllByCustomerId(Long id) {
        return transactionPersistencePort.getAllByCustomerId(id);
    }
}
