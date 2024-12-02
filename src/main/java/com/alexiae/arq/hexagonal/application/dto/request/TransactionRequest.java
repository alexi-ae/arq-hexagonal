package com.alexiae.arq.hexagonal.application.dto.request;

import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransactionRequest {

  private Long id;

  private BigDecimal amount;

  private String status;

  private String type;

  private AccountRequest account;
}
