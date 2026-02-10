//This code is demonstration on the constructor of the class with single parameter method in an Interface
// for this we need to use new keyword
package LambdaExpressionDemo;

//Interface
interface lambda
{
    public void print(String str);
}

public class LunchLambdaExpression07
{
    //Constructor
    public LunchLambdaExpression07(String s)
    {
        System.out.println(s.toUpperCase());
    }
    public static void main(String[] args)
    {
        lambda la = LunchLambdaExpression07::new;
        la.print("happy");

    }
}
