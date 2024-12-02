package com.alexiae.arq.hexagonal.application.mapper;

import com.alexiae.arq.hexagonal.application.dto.AccountDto;
import com.alexiae.arq.hexagonal.application.dto.request.AccountRequest;
import com.alexiae.arq.hexagonal.domain.model.Account;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AccountMapper {

    Account toDomain(AccountRequest request);

    AccountDto toDto(Account account);

    List<AccountDto> toListDto(List<Account> listAccount);
}
