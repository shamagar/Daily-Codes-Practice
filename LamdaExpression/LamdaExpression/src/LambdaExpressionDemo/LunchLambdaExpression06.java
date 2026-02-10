//This code is on method reference
package LambdaExpressionDemo;

//Interface
interface MyLambda02
{
    public void display(String str);
}

public class LunchLambdaExpression06
{
    //Static method to reverse the input String
    public static void reverseString(String str)
    {
        StringBuffer  sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }

    //Nonstatic method
    public void reverseString2(String str2)
    {
        StringBuffer sb2 = new StringBuffer(str2);
        sb2.reverse();
        System.out.println(sb2);
    }
    //Main Method
    public static void main(String[] args)
    {
        //For Static method
        //LunchLambdaExpression06 is a class and
        //reverseString is a static method and assign as a display method
        MyLambda02 lam = LunchLambdaExpression06::reverseString;
        lam.display("Hi,I am method reference in a Lambda.");

        System.out.println("*********************");

        //For nonstatic method
        LunchLambdaExpression06 lde = new LunchLambdaExpression06();
        lde.reverseString2("Hello World");
    }
}
