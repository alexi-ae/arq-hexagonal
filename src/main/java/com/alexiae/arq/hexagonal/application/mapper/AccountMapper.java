package com.alexiae.arq.hexagonal.application.mapper;

import com.alexiae.arq.hexagonal.domain.dto.AccountDto;
import com.alexiae.arq.hexagonal.domain.dto.request.AccountRequest;
import com.alexiae.arq.hexagonal.domain.model.Account;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AccountMapper {

  Account toDomain(AccountRequest request);

  AccountDto toDto(Account account);
}
