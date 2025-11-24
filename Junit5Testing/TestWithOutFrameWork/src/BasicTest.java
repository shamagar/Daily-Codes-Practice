/*
    This codes demonstration on basic test without Junit framework or test is done manually
*/

import java.sql.SQLOutput;

//Creating the class
class Calculation
{
    //Method to calculate division
    public double calculateDivision(double a, double b)
    {
        return a / b;
    }

    //Method to calculate the result
    public double calculateResult(double x, double y)
    {
        return x * y;
    }

}
public class BasicTest
{
    public static void main(String[] args)
    {
        //Instantiation of the class
        Calculation calc = new Calculation();
        double result = calc.calculateDivision(10.0, 5.0);
        //System.out.println(result);

        //Manually testing by using if else statement
        if(result == 2)
            System.out.println("Test case passed.");
        else
            System.out.println("Test case failed.");

        System.out.println("***************");

        //Testing other method
        double product = calc.calculateResult(23.0, 2.0);

        //Manually testing by using if else statement
        if(product == 2)
            System.out.println("Test case passed.");
        else
            System.out.println("Test case failed.");
    }
}