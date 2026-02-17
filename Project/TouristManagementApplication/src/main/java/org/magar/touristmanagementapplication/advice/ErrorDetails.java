package org.magar.touristmanagementapplication.advice;

import java.time.LocalDateTime;

public class ErrorDetails
{
    //Properties
    private String statusCode;
    private String message;
    private LocalDateTime when;

    //Parameterize Constructor
    public ErrorDetails(String statusCode, String message, LocalDateTime when)
    {
        this.statusCode = statusCode;
        this.message = message;
        this.when = when;
    }
    //Non parameterize constructor
    public ErrorDetails()
    {
        super();
    }

    //Setter and getter methods to set and get the value
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setWhen(LocalDateTime when) {
        this.when = when;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public String getMessage() {
        return message;
    }

    public LocalDateTime getWhen() {
        return when;
    }

    //ToString method
    @Override
    public String toString()
    {
        return "ErrorDetails{" +
                "statusCode='" + statusCode + '\'' +
                ", message='" + message + '\'' +
                ", when=" + when +
                '}';
    }
}
