package com.alexiae.arq.hexagonal.domain.model;

import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Transaction {

  private Long id;

  private BigDecimal amount;

  private String status;

  private String type;

  private Account account;
}
