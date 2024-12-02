package com.alexiae.arq.hexagonal.application.usercase;

import com.alexiae.arq.hexagonal.domain.model.Account;
import com.alexiae.arq.hexagonal.domain.port.in.GetAllAccountUseCase;
import com.alexiae.arq.hexagonal.domain.port.out.AccountPersistencePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetAllAccountUseCaseImpl implements GetAllAccountUseCase {

    @Autowired
    private AccountPersistencePort accountPersistencePort;

    @Override
    public List<Account> getAllByCustomerId(Long id) {
        return accountPersistencePort.getAllByCustomerId(id);
    }
}
