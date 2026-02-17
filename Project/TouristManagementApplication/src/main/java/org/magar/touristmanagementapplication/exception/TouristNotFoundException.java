package org.magar.touristmanagementapplication.exception;

public class TouristNotFoundException extends RuntimeException
{
    //Constructor
    public TouristNotFoundException(String message)
    {
        super(message);
    }
}
