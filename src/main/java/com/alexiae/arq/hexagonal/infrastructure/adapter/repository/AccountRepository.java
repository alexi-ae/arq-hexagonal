package com.alexiae.arq.hexagonal.infrastructure.adapter.repository;

import com.alexiae.arq.hexagonal.infrastructure.adapter.entity.AccountEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<AccountEntity, Long> {

  List<AccountEntity> findAllByCustomerId(Long customerId);
}
