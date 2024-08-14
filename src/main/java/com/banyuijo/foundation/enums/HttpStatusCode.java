package com.banyuijo.foundation.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
@Getter
@RequiredArgsConstructor
public enum HttpStatusCode {
    DATA_NOT_FOUND (100001, HttpStatus.NO_CONTENT, false, "Data Not Found"),
    MISSING_MANDATORY_PROPERTY (100002, HttpStatus.BAD_REQUEST, true, "Missing mandatory property %s"),
    INVALID_DATA_TYPE(100003, HttpStatus.BAD_REQUEST,true,"Invalid data type for property %s"),
    MAXIMUM_LENGTH_EXCEEDED (100004, HttpStatus.BAD_REQUEST, true, "Maximum length for property %s is %s"),
    MINIMUM_LENGTH_EXCEEDED (100005, HttpStatus.BAD_REQUEST, true, "Minimum length for property %s is %s");

    private final int code;
    private final HttpStatus status;
    private final boolean parameterized;
    private final String format;
}
