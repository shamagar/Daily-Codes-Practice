package com.JUnitLearning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculationTest
{
    @Test
    public void testCalculation()
    {
        //Instantiation of the non static class
        Calculation calculation = new Calculation();
        int actualResult = calculation.Divide(8,4);
        int expectedResult = 2;
        assertEquals(expectedResult,actualResult);

        System.out.println("****************");
        int actual = calculation.Result(10,2);
        int expected = 20;
        assertEquals(expected,actual);
    }

}
