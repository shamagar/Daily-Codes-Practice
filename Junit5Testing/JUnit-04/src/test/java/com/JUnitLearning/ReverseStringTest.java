package com.JUnitLearning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseStringTest
{
    //Instantiation the class
    ResverseString res = new ResverseString();
    //Just for single input String
    @Test
    public void singleString()
    {
        //String actual = res.inputString("Java");
        //String expected = "avaJ";
        //assertEquals(expected,actual);
        assertEquals("avaJ", res.inputString("Java"));
    }

    //For multiple String
    @Test
    public void multipleString()
    {
        assertEquals("ysae na ton a si avaJ", res.inputString("Java is a not an easy"));
    }
}
