package org.vagrs.auction.configuration.exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * Created by Kirill Zhitelev on 15.02.2018.
 */
@ControllerAdvice
public class AuctionExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler({UsernameNotFoundException.class})
    protected ResponseEntity<Object> handleUserException(RuntimeException e, WebRequest webRequest) {
        return null;
    }


}
