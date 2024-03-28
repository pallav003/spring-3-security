package com.auth.auth.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
public class ErrorRes {
    private HttpStatus httpStatus;
    private String message;
}

