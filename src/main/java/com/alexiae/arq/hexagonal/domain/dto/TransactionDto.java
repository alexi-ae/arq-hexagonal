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
public class TransactionDto {

  private Long id;

  private BigDecimal amount;

  private String status;

  private String type;

  private AccountDto account;
}
