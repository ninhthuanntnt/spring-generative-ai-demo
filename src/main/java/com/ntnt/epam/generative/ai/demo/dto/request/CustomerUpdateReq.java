package com.ntnt.epam.generative.ai.demo.dto.request;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CustomerUpdateReq {
  private String name;
  private String address;
  private String phoneNumber;
}