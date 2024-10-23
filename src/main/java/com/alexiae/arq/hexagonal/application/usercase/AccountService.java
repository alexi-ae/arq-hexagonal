package com.alexiae.arq.hexagonal.application.usercase;

import com.alexiae.arq.hexagonal.domain.dto.AccountDto;
import com.alexiae.arq.hexagonal.domain.dto.request.AccountRequest;
import java.util.List;

public interface AccountService {

  AccountDto create(AccountRequest request);

  AccountDto getById(Long id);

  List<AccountDto> getAllByCustomerId(Long id);

  void deleteById(Long id);

  AccountDto update(AccountRequest request);
}
