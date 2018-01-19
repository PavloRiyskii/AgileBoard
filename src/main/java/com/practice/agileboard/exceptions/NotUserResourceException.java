package com.practice.agileboard.exceptions;

/**
 * Created by Павло on 13.12.2017.
 */
public class NotUserResourceException extends RuntimeException {
    public NotUserResourceException(String message) {
        super(message);
    }
}
