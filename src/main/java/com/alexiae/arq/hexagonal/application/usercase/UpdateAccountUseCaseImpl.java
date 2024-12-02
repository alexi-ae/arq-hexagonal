package com.alexiae.arq.hexagonal.application.usercase;

import com.alexiae.arq.hexagonal.domain.model.Account;
import com.alexiae.arq.hexagonal.domain.port.in.UpdateAccountUseCase;
import com.alexiae.arq.hexagonal.domain.port.out.AccountPersistencePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateAccountUseCaseImpl implements UpdateAccountUseCase {

    @Autowired
    private AccountPersistencePort accountPersistencePort;

    @Override
    public Account update(Long id, Account account) {
        Account entity = accountPersistencePort.getById(id);
        accountPersistencePort.update(entity);
        return accountPersistencePort.update(entity);
    }
}
