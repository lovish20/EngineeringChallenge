package com.foodtruckfinder.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ParametersOutOfBoundsException extends RuntimeException {

    public ParametersOutOfBoundsException(String exception) {
        super(exception);
    }

}
