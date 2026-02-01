//This code is demonstration on BufferInputStream and its benefits
//Buffer means a temporary memory area which holds a data to maintain the speed stream between local program and remote.
//If there is different speed between device and the program, then we use buffer
package Buffere;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LunchBufferInputStream
{
    public static void main(String[] args)
    {
        try(FileInputStream fis = new FileInputStream("/Users/shamagar/Desktop/file/Text.txt"))
        {
            BufferedInputStream bis = new BufferedInputStream(fis);

            /*
            //Reading the file
            int b;
            while((b = bis.read()) != -1)
            {
                System.out.print((char)b);
            }
             */
            System.out.println();

            //BufferInputStream Benefits
            System.out.println("File:: "+fis.markSupported()); //False
            //Note:BufferInputStream is markSupported but not a FileInputStream
            System.out.println("Buffer:: "+bis.markSupported()); //True

            //Uses of Mark
            System.out.print((char) bis.read()); //print L
            System.out.print((char) bis.read()); //print E
            System.out.print((char) bis.read()); //print A
            bis.mark(10);       //Validating the Marking up to 10 laters
            System.out.print((char) bis.read()); //print R
            System.out.print((char) bis.read()); //print N
            bis.reset();    //It will go back at the mark point and print it from that character
            System.out.print((char) bis.read()); //print R
            System.out.print((char) bis.read()); //print N

            //Closing the Resource
            bis.close();
            fis.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
}
