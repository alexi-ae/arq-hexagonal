package com.alexiae.arq.hexagonal.application.service;

import com.alexiae.arq.hexagonal.application.dto.AccountDto;
import com.alexiae.arq.hexagonal.application.dto.request.AccountRequest;

import java.util.List;

public interface AccountService {

    AccountDto create(AccountRequest request);

    AccountDto update(AccountRequest request);

    List<AccountDto> getAllByCustomerId(Long customerId);
}
