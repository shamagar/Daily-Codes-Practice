//This program is to compute the area of different shapes and for the test we use supplier Interface.
//In test:  we are going to use the supplier Interface and discuss the different between.
//Supplier Interface is a functional interface.
//Directly passing the string message in a assertEquals method, asserEquals method is evaluating the message whatever the test
//fail or pass and the massage is display only when the test is fail.
//------Using Supplier Interface
//In this case when the test case is pass then the string message not evaluated by assertEquals method,however
// it will only evaluate by assertEquals method and displays when the test case is fail.

package com.JUnitLearning;

public class Shapes
{
    //Method to compute the area of a circle
    public double areaOfCircle(double radius)
    {
        return Math.PI * radius * radius;
    }

    //Method to compute the area of Square
    public double areaOfSquare(double length)
    {
        return length * length;
    }

    //Method to compute area of rectangle
    public double areaOfRectangle(double width, double height)
    {
        return 2 * (width + height);
    }
}
