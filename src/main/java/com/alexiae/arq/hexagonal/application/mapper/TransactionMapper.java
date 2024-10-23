package com.alexiae.arq.hexagonal.application.mapper;

import com.alexiae.arq.hexagonal.domain.dto.TransactionDto;
import com.alexiae.arq.hexagonal.domain.dto.request.TransactionRequest;
import com.alexiae.arq.hexagonal.domain.model.Transaction;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TransactionMapper {

  Transaction toDomain(TransactionRequest request);

  TransactionDto toDto(Transaction account);
}
