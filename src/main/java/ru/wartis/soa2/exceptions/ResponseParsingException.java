package ru.wartis.soa2.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ResponseParsingException extends RuntimeException {
    public ResponseParsingException(String message) {
        super(message);
    }
}
