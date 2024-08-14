package com.banyuijo.foundation.config;

import com.banyuijo.foundation.dto.base.ApiResponseDto;
import com.banyuijo.foundation.enums.HttpStatusCode;
import com.banyuijo.foundation.exception.HttpStatusException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.HashMap;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(HttpStatusException.class)
    public final ResponseEntity<ApiResponseDto> error(HttpStatusCode ex) {
        ApiResponseDto response = new ApiResponseDto(ex.getStatus(), new HashMap<>(), ex.getFormat());
        return new ResponseEntity<>(response, ex.getStatus());
    }

}
