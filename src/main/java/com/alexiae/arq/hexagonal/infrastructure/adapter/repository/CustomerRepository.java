package com.alexiae.arq.hexagonal.infrastructure.adapter.repository;

import com.alexiae.arq.hexagonal.infrastructure.adapter.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {

}
