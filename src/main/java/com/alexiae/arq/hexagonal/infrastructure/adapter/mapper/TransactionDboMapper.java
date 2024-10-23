package com.alexiae.arq.hexagonal.infrastructure.adapter.mapper;

import com.alexiae.arq.hexagonal.domain.model.Transaction;
import com.alexiae.arq.hexagonal.infrastructure.adapter.entity.TransactionEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TransactionDboMapper {

  TransactionEntity toEntity(Transaction transaction);

  Transaction toDomain(TransactionEntity entity);
}
