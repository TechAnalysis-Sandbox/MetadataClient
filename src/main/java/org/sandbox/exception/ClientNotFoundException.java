package org.sandbox.exception;

public class ClientNotFoundException extends RuntimeException {

    public ClientNotFoundException(String message, Throwable cause,
                                   boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public ClientNotFoundException(String message) {
        super(message);
    }
}
