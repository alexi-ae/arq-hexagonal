package com.alexiae.arq.hexagonal.domain.model;

import java.math.BigDecimal;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Account {

  private Long id;

  private String accountNumber;

  private BigDecimal balance;

  private Customer customer;
}
