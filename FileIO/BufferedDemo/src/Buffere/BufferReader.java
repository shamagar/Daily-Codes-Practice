//This code is demonstration on BufferedReader and FileReader
//BufferedReader or fileReader is use for character
package Buffere;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader
{
    public static void main(String[] args)
    {
        try(FileReader fr = new FileReader("/Users/shamagar/Desktop/file/Test.txt"))
        {
            //Initializing the BufferReader
            BufferedReader br = new BufferedReader(fr);

            //Reading the file
            int c;
            while((c = br.read()) != -1)
            {
                System.out.println((char)c);
            }

            //Using mark method
            System.out.println((char)br.read());
            System.out.println((char)br.read());
            System.out.println((char)br.read());
            br.mark(10);
            System.out.println((char)br.read());
            System.out.println((char)br.read());
            br.reset();
            System.out.println((char)br.read());
            System.out.println((char)br.read());

            //ReadLine method in BufferedReader read the whole line
            System.out.println(br.readLine());

            //Closing the Resource
            fr.close();
            br.close();

        } catch (FileNotFoundException e)
        {
            System.out.println("File Not Found");
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
}
