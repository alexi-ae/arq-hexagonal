package com.alexiae.arq.hexagonal.application.usercase;

import com.alexiae.arq.hexagonal.domain.model.Account;
import com.alexiae.arq.hexagonal.domain.port.in.CreateAccountUseCase;
import com.alexiae.arq.hexagonal.domain.port.out.AccountPersistencePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateAccountUseCaseImpl implements CreateAccountUseCase {

    @Autowired
    private AccountPersistencePort accountPersistencePort;

    @Override
    public Account create(Account account) {
        return accountPersistencePort.create(account);
    }
}
