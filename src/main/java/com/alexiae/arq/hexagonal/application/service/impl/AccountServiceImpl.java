package com.alexiae.arq.hexagonal.application.service.impl;

import com.alexiae.arq.hexagonal.application.dto.AccountDto;
import com.alexiae.arq.hexagonal.application.dto.request.AccountRequest;
import com.alexiae.arq.hexagonal.application.mapper.AccountMapper;
import com.alexiae.arq.hexagonal.application.service.AccountService;
import com.alexiae.arq.hexagonal.domain.port.in.CreateAccountUseCase;
import com.alexiae.arq.hexagonal.domain.port.in.GetAllAccountUseCase;
import com.alexiae.arq.hexagonal.domain.port.in.UpdateAccountUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private CreateAccountUseCase createAccountUseCase;

    @Autowired
    private UpdateAccountUseCase updateAccountUseCase;

    @Autowired
    private GetAllAccountUseCase getAllAccountUseCase;

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public AccountDto create(AccountRequest request) {
        var account = createAccountUseCase.create(accountMapper.toDomain(request));
        return accountMapper.toDto(account);
    }

    @Override
    public AccountDto update(AccountRequest request) {
        var account = updateAccountUseCase.update(request.getId(), accountMapper.toDomain(request));
        return accountMapper.toDto(account);
    }

    @Override
    public List<AccountDto> getAllByCustomerId(Long customerId) {
        var listAccount = getAllAccountUseCase.getAllByCustomerId(customerId);
        return accountMapper.toListDto(listAccount);
    }
}
