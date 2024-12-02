package com.alexiae.arq.hexagonal.infrastructure.adapter;

import com.alexiae.arq.hexagonal.domain.model.Account;
import com.alexiae.arq.hexagonal.domain.port.out.AccountPersistencePort;
import com.alexiae.arq.hexagonal.infrastructure.adapter.entity.AccountEntity;
import com.alexiae.arq.hexagonal.infrastructure.adapter.mapper.AccountDboMapper;
import com.alexiae.arq.hexagonal.infrastructure.adapter.repository.AccountRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class AccountJpaAdapter implements AccountPersistencePort {

  @Autowired
  private AccountRepository accountRepository;

  @Autowired
  private AccountDboMapper accountDboMapper;

  @Override
  public Account create(Account request) {
    AccountEntity entity = accountDboMapper.toEntity(request);
    entity = accountRepository.save(entity);
    return accountDboMapper.toDomain(entity);
  }


  @Override
  public Account getById(Long id) {
    AccountEntity entity = accountRepository.findById(id)
        .orElseThrow(() -> new IllegalArgumentException("Account not found"));
    return accountDboMapper.toDomain(entity);
  }

  @Override
  public List<Account> getAllByCustomerId(Long id) {
    return accountRepository.findAllByCustomerId(id).stream()
        .map(accountDboMapper::toDomain)
        .toList();
  }

  @Override
  public void deleteById(Long id) {
    accountRepository.deleteById(id);
  }

  @Override
  public Account update(Account request) {
    AccountEntity entity = accountDboMapper.toEntity(request);
    entity = accountRepository.save(entity);
    return accountDboMapper.toDomain(entity);
  }
}
