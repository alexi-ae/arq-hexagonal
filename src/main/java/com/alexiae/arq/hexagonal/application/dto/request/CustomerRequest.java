package com.alexiae.arq.hexagonal.application.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerRequest {

  private Long id;

  private String name;
}
