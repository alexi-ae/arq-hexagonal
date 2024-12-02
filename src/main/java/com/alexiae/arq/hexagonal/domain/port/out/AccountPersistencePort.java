package com.alexiae.arq.hexagonal.domain.port.out;

import com.alexiae.arq.hexagonal.domain.model.Account;
import java.util.List;

public interface AccountPersistencePort {

  Account create(Account request);

  Account getById(Long id);

  List<Account> getAllByCustomerId(Long id);

  void deleteById(Long id);

  Account update(Account request);

}
