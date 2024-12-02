package com.alexiae.arq.hexagonal.domain.port.in;

import com.alexiae.arq.hexagonal.domain.model.Account;

import java.util.List;

public interface GetAllAccountUseCase {

    List<Account> getAllByCustomerId(Long id);
}
