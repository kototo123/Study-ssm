package com.kototo.mvc.ex.exceptionhandler;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ArithmeticException.class)
    public Object handleArithmeticException(ArithmeticException ex, HttpServletRequest request) {
        String message = ex.getMessage();
        System.out.println("message = " + message);
        return "{code: 500, message: 'by zero'}";
    }

    @ExceptionHandler(NullPointerException.class)
    public Object handleNullPointerException(NullPointerException ex, HttpServletRequest request) {
        String message = ex.getMessage();
        System.out.println("message = " + message);
        return "{code: 500, message: 'Null Pointer'}";
    }

    @ExceptionHandler(Exception.class)
    public Object handleException(Exception ex, HttpServletRequest request) {
        String message = ex.getMessage();
        System.out.println("message = " + message);
        return "{code: 500, message: 'Don't NO what ex'}";
    }

}
