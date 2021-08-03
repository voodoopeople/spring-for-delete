package com.template.springboottemplate.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHelperController {
    private final Logger log = LoggerFactory.getLogger(UserController.class);

    @ExceptionHandler(value = { Exception.class })
    public ResponseEntity<Object> handleUnauthorizedException(Exception ex) {
        log.debug("Unauthorized Exception: ", ex.getMessage());

        return new ResponseEntity<Object>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }
}


