package com.crofle.livecrowdfunding.exception;


import com.crofle.livecrowdfunding.domain.enums.ErrorCode;

public class CustomException extends RuntimeException {
    private final ErrorCode errorCode;

    public CustomException(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }
}
