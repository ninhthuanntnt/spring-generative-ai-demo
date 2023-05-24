package com.ntnt.epam.generative.ai.demo.exception.constant;

import lombok.Getter;

@Getter
public enum ErrorCode {
  CUS_00000("CUS-0000", "Customer not found"),
  PROD_00000("CUS-0000", "Product not found");

  private final String code;
  private final String message;

  ErrorCode(String code, String message) {
    this.code = code;
    this.message = message;
  }
}
