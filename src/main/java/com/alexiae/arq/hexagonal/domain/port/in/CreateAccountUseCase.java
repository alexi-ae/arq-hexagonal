package com.alexiae.arq.hexagonal.domain.port.in;

import com.alexiae.arq.hexagonal.domain.model.Account;

public interface CreateAccountUseCase {
    Account create(Account account);
}
