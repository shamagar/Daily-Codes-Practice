//This code is demonstration on how lambda is use in Collections.
package LambdaExpressionDemo;

import java.util.List;

public class LunchLambdaExpression04
{
    public static void main(String[] args)
    {
        //Creating Collection of String
        List<String> names = List.of("Frizzel","Shayan","Jayson");
        //Printing the element using for each
        names.forEach(name-> System.out.println(name));

        System.out.println("****************");

        //Even Shorter way to print using println
        names.forEach(System.out::println);
    }
}
