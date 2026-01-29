//This code is demonstrating on copying the data from multiple files to store in a single file
import java.io.*;

public class LunchCopyingMultipleFile
{
    public static void main(String[] args)
    {
        try
        {
            //Info about the two exiting files
            FileInputStream f1 = new FileInputStream("/Users/shamagar/Desktop/file/Source1.txt");
            FileInputStream f2 = new FileInputStream("/Users/shamagar/Desktop/file/Source2.txt");

            //Creating a new file to store the data from two files
            FileOutputStream fos = new FileOutputStream("/Users/shamagar/Desktop/file/Target.txt");

            //Using SequenceInputStream
            SequenceInputStream sis = new SequenceInputStream(f1, f2);
            int b;
            while((b = sis.read()) != -1)
            {
               fos.write(b);
            }

            //Closing the resource
            sis.close();
            f1.close();
            f2.close();
            fos.close();

        }
        catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
}
