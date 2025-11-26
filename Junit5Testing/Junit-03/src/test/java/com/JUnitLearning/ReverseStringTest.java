package com.JUnitLearning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseStringTest
{
    @Test
    public void test()
    {
        //Instantiation of the class and invok the method
        ReverseString reverseString = new ReverseString();
        String actualString = reverseString.reverseString("Junit");
        String expectedString = "tinuJ";
        assertEquals(expectedString, actualString);
    }
}
