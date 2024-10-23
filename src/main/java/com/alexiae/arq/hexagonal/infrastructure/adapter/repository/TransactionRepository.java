package com.alexiae.arq.hexagonal.infrastructure.adapter.repository;

import com.alexiae.arq.hexagonal.infrastructure.adapter.entity.TransactionEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<TransactionEntity, Long> {

  List<TransactionEntity> findAllByAccountCustomerId(Long id);
}
