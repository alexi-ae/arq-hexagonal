package com.alexiae.arq.hexagonal.domain.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Customer {

  private Long id;

  private String name;
}
