package com.alexiae.arq.hexagonal.application.service;

import com.alexiae.arq.hexagonal.application.mapper.AccountMapper;
import com.alexiae.arq.hexagonal.application.usercase.AccountService;
import com.alexiae.arq.hexagonal.domain.dto.AccountDto;
import com.alexiae.arq.hexagonal.domain.dto.request.AccountRequest;
import com.alexiae.arq.hexagonal.domain.port.AccountPersistencePort;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountManagementService implements AccountService {

  @Autowired
  private AccountPersistencePort accountPersistencePort;

  @Autowired
  private AccountMapper accountMapper;

  @Override
  public AccountDto create(AccountRequest request) {
    var account = accountPersistencePort.create(accountMapper.toDomain(request));
    return accountMapper.toDto(account);
  }

  @Override
  public AccountDto getById(Long id) {
    return accountMapper.toDto(accountPersistencePort.getById(id));
  }

  @Override
  public List<AccountDto> getAllByCustomerId(Long id) {
    return accountPersistencePort.getAllByCustomerId(id).stream()
        .map(accountMapper::toDto)
        .toList();
  }

  @Override
  public void deleteById(Long id) {
    accountPersistencePort.deleteById(id);
  }

  @Override
  public AccountDto update(AccountRequest request) {
    var account = accountPersistencePort.update(accountMapper.toDomain(request));
    return accountMapper.toDto(account);
  }
}
