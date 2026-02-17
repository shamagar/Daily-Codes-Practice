package org.magar.touristmanagementapplication.advice;

import org.magar.touristmanagementapplication.exception.TouristNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class TouristErrorController
{
    @ExceptionHandler(TouristNotFoundException.class)
    public ResponseEntity<ErrorDetails> handleExceptionForTourist(TouristNotFoundException tn)
    {
        //Creating the object of ErrorDetails class
        ErrorDetails er = new ErrorDetails("404 Not Found",tn.getMessage(), LocalDateTime.now());
        return new ResponseEntity<ErrorDetails>(er, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorDetails> handleExceptionGlobally(Exception e)
    {
        //Creating object
        ErrorDetails er = new ErrorDetails("500 Internal Server Error",e.getMessage(), LocalDateTime.now());
        return new ResponseEntity<ErrorDetails>(er, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
