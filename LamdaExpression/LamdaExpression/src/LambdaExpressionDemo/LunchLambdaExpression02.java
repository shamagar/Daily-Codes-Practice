//This code is demonstration on Lambda Expression with parameters
package LambdaExpressionDemo;

//Functional Interface
@FunctionalInterface
interface LambdaExpression
{
    public int Result( int a, int b);
}
public class LunchLambdaExpression02
{
    public static void main(String[] args)
    {
        //Lambda Expression with return statement
        LambdaExpression ld = (x,y)->{return x+y;};
        int result = ld.Result(10,3);
        System.out.println(result);

        System.out.println("****************");

        //OR we can do with writing return statement
        LambdaExpression ld2 = (m,n) -> m+n;
        System.out.println(ld2.Result(30,3));



    }
}
