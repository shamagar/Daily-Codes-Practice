//This code is demonstration on using ByteArrayInputStream may be coming from another threads or remote computer
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class LunchByteArrayInputStream
{
    public static void main(String[] args)
    {
        //Initializing the byte array
        byte b [] = {'a','b','c','d','e','f','g','h','i'};

        //Creating the object of the ByteArrayInputStream
        ByteArrayInputStream bis = new ByteArrayInputStream(b);
        //Reading all the bytes at a single time
        //It stores in a ByteArray and convert into String
        String str = new String(bis.readAllBytes());
        System.out.println(str);
        System.out.println("*************************");
        //Check for mark supported
        System.out.println(bis.markSupported()); //True, it is an array and it can read the data multiple time


        //Method 2
        /*
        //Printing each byte
        int c;
        while((c = bis.read()) != -1)
        {
            System.out.print((char)c +" ");
        }
        //Closing the resource
        try
        {
            bis.close();
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
         */

    }
}
