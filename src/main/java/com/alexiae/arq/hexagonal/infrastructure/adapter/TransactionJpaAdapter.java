package com.alexiae.arq.hexagonal.infrastructure.adapter;

import com.alexiae.arq.hexagonal.domain.model.Transaction;
import com.alexiae.arq.hexagonal.domain.port.TransactionPersistencePort;
import com.alexiae.arq.hexagonal.infrastructure.adapter.entity.TransactionEntity;
import com.alexiae.arq.hexagonal.infrastructure.adapter.mapper.TransactionDboMapper;
import com.alexiae.arq.hexagonal.infrastructure.adapter.repository.TransactionRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class TransactionJpaAdapter implements TransactionPersistencePort {

  @Autowired
  private TransactionRepository transactionRepository;

  @Autowired
  private TransactionDboMapper transactionDboMapper;

  @Override
  public Transaction create(Transaction request) {
    TransactionEntity entity =
        transactionRepository.save(transactionDboMapper.toEntity(request));
    return transactionDboMapper.toDomain(entity);
  }

  @Override
  public Transaction getById(Long id) {
    TransactionEntity entity = transactionRepository.findById(id)
        .orElseThrow(() -> new IllegalArgumentException("Customer not found"));
    return transactionDboMapper.toDomain(entity);
  }

  @Override
  public List<Transaction> getAllByCustomerId(Long id) {
    return transactionRepository.findAllByAccountCustomerId(id).stream()
        .map(transactionDboMapper::toDomain).toList();
  }

  @Override
  public void deleteById(Long id) {
    transactionRepository.deleteById(id);
  }

  @Override
  public Transaction update(Transaction request) {
    TransactionEntity entity =
        transactionRepository.save(transactionDboMapper.toEntity(request));
    return transactionDboMapper.toDomain(entity);
  }
}
