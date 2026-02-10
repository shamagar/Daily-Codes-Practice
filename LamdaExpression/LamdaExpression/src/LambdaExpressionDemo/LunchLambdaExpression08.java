//This code is for having multiples parameter  in a method
package LambdaExpressionDemo;

//Interface
interface lambdaDemo
{
    public int toDisplay(String str1, String str2);
}

public class LunchLambdaExpression08
{
    public static void main(String[] args)
    {
        //Use compareTo
        lambdaDemo l = String::compareTo;
        System.out.println(l.toDisplay("World", "World"));  //Print 0
        System.out.println(l.toDisplay("World", "Horld"));  //print 15
        System.out.println(l.toDisplay("Eorld", "Will"));  //-18
    }
}
