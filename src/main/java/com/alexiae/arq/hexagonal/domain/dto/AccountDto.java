package com.alexiae.arq.hexagonal.domain.dto;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AccountDto {

  private Long id;

  private String accountNumber;

  private BigDecimal balance;

  private CustomerDto customer;
}
