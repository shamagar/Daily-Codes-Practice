//In this code we are passing the functional interface as a parameter
// Three keys about Lambda Expression::
//1->Lambda Expression only work with Functional Interface
//2->They can access effectively final variables
package LambdaExpressionDemo;

import java.util.List;

//Creating Functional Interface
@FunctionalInterface
interface MyLambda2
{
    public void display();
}

//Creating a class and method which holds interface as a parameter
class useLambda
{
    public void callLambda(MyLambda2 lm)
    {
        lm.display();
    }
}

//Creating a another class
class Demo
{
    public void method()
    {
        useLambda ul = new useLambda();
        ul.callLambda(()-> System.out.println("Hello Lambda Expression!"));
    }
}
public class LunchLambdaExpression03
{
    //Main Method
    public static void main(String[] args)
    {
        Demo demo = new Demo();
        demo.method();
    }
}
