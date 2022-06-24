package com.exception;

/**
 * @author herman
 * @version 1.0
 * 自定义异常
 */
public class SelfException extends RuntimeException{
    public SelfException(String message) {
        super(message);
    }
}
