package com.ntnt.epam.generative.ai.demo.dto.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CustomerUpdateReq {
  private String name;
  private String address;
  private String phoneNumber;
}
