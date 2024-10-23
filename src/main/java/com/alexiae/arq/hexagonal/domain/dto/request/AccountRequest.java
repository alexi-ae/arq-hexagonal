package com.alexiae.arq.hexagonal.domain.dto.request;

import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountRequest {

  private Long id;

  private String accountNumber;

  private BigDecimal balance;

  private CustomerRequest customer;
}
