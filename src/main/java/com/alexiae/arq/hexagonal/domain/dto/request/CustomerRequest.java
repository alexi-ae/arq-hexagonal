package com.alexiae.arq.hexagonal.domain.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerRequest {

  private Long id;

  private String name;
}
