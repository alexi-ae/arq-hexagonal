package com.alexiae.arq.hexagonal.infrastructure.adapter.mapper;

import com.alexiae.arq.hexagonal.domain.model.Account;
import com.alexiae.arq.hexagonal.infrastructure.adapter.entity.AccountEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AccountDboMapper {

  AccountEntity toEntity(Account account);

  Account toDomain(AccountEntity entity);
}
