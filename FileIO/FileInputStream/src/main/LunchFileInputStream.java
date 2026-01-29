//This code is demonstration on reading the data from the resource or file using FileInputStream class
package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class LunchFileInputStream
{
    public static void main(String[] args) throws Exception
    {
        try(FileInputStream fis = new FileInputStream("/Users/Shamagar/Desktop/file/Text.txt"))
        {
            //Method 1
             /*
            //It will provide the actual byte available in the file and store in a byte array
            byte [] b = new byte[fis.available()];
           fis.read(b);
           //Convert into String
           String str = new String(b);
           //Display on the console
            System.out.println(str);
             */

            //Method 2
            //Read the data byte by byte and print on the console using do While loop
            /*
          int x;
          do
          {
              x = fis.read(); //read the data or ASCII code and store as  integer value
              //Checking the value of x till the value of x is not equal to -1 and print
              if(x != -1)
                System.out.print((char)x);
          }while(x != -1);

             */

            //Method 3 using While loop
            int y;
            while((y = fis.read()) != -1)
            {
                System.out.print((char)y);
            }
            //Close the resource
            fis.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e);;
        }
    }
}
