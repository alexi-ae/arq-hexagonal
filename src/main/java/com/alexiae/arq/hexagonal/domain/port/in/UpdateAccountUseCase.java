package com.alexiae.arq.hexagonal.domain.port.in;

import com.alexiae.arq.hexagonal.domain.model.Account;

public interface UpdateAccountUseCase {

    Account update(Long id, Account account);
}
