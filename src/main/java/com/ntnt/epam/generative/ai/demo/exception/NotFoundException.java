package com.ntnt.epam.generative.ai.demo.exception;

import com.ntnt.epam.generative.ai.demo.exception.constant.ErrorCode;

public class NotFoundException extends RuntimeException {
    public NotFoundException(ErrorCode errorCode) {
        super(errorCode.getCode() + "-" + errorCode.getMessage());
    }
}