package com.ntnt.epam.generative.ai.demo.dto.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CustomerRes {
  private Long id;
  private String name;
  private String address;
  private String phoneNumber;
}