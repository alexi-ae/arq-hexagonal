package com.alexiae.arq.hexagonal.domain.port;

import com.alexiae.arq.hexagonal.domain.model.Account;
import com.alexiae.arq.hexagonal.domain.model.Transaction;
import java.util.List;

public interface TransactionPersistencePort {

  Transaction create(Transaction request);

  Transaction getById(Long id);

  List<Transaction> getAllByCustomerId(Long id);

  void deleteById(Long id);

  Transaction update(Transaction request);
}
