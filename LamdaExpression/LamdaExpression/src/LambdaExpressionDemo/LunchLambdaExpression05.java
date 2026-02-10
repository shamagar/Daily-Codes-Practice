//This code is on method reference
package LambdaExpressionDemo;

//Interface
interface lambda1
{
    public void display(String str);
}

public class LunchLambdaExpression05
{
    //Main Method
    public static void main(String[] args)
    {
        //Method Reference
        //System.out:: System is a class and out is method inside that
        //println is a static method and assign as a display method of a lambda1 interface
        lambda1 lam = System.out::println;
        lam.display("Hi,I am method reference in a Lambda.");
    }
}
