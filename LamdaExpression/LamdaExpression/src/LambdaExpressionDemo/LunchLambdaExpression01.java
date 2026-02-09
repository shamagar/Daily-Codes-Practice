//This code is demonstration on LamdaExpression
//Lambda Expressions are used for defining anonymous expression or nameless methods of functions
//It defines as with the help of functional interface. A functional interface has exactly one abstract method.

package LambdaExpressionDemo;

//Creating Functional interface
@FunctionalInterface
interface Mylambda
{
    //Single method
    public void display();
}

/*
//Creating class
class LambdaExpression implements Mylambda
{
    @Override
    public void display()
    {
        System.out.println("LambdaExpression display");
    }
}
 */
//Main method
public class LunchLambdaExpression01
{
    public static void main(String[] args)
    {
        //Initializing the LambdaExpression class
        //LambdaExpression le = new LambdaExpression();
        //le.display();

        //Syntax for Lambda Expression:: ()->
        Mylambda my = ()-> {System.out.println("Hello Lambda Expression");};
        my.display();
    }

}
