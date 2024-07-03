package org.sandbox.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZonedDateTime;

@ControllerAdvice
public class ClientExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<ClientErrorResponse> clientNotFoundHandler(ClientNotFoundException ex,
                                                                     HttpServletRequest request) {
        ClientErrorResponse clientErrorResponse = new ClientErrorResponse(
                ZonedDateTime.now(),
                HttpStatus.NOT_FOUND.value(),
                request.getRequestURI(),
                ex.getMessage()
        );
        return new ResponseEntity<>(clientErrorResponse, HttpStatus.NOT_FOUND);
    }
}
