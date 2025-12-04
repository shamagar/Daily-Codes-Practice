//In this program we are going to use the supplier Interface and discuss the different between
//Supplier Interface is a functional interface
package com.JUnitLearning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapesTest
{
    Shapes shapes = new Shapes();

    //Not using Supplier Interface
    //Here directly passing the string message, asserEquals method is evaluating the passing message whatever the test
    //fail or pass and the massage is display only when the test is fail.
    @Test
    void getTest()
    {
        assertEquals(25,shapes.areaOfSquare(5),"Calcualtion is wrong for area of Sqaure.");
    }

    //Using Supplier Interface
    //In this case when the test case is pass then the string message not evaluated by assertEquals method,however
    // it will only evaluate by assertEquals method and displays when the test case is fail.
    @Test
    void getTest2_UsingSupplier()
    {
        assertEquals(30,shapes.areaOfRectangle(10,5), ()->"Calculation is wrong for area of Rectangle.");
    }

}