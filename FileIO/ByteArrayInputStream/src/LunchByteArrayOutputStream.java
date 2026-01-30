//This code is demonstration on ByteArraySteam, it is helpful to send the data to the file
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class LunchByteArrayOutputStream
{
    public static void main(String[] args)
    {
        //Initializing the ByteArray and providing the size
        ByteArrayOutputStream bos = new ByteArrayOutputStream(15);
        bos.write('a');
        bos.write('b');
        bos.write('c');
        bos.write('d');

        byte[] data = bos.toByteArray();
        //Printing the data using for each loop
        for(byte b : data)
            System.out.print((char)b+" ");
        System.out.println("***********************");
        //Writing in the file
        try
        {
            bos.writeTo(new FileOutputStream("/Users/shamagar/Desktop/file/Text.txt"));
        }
        catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
        //Closing the resource
        try
        {
            bos.close();
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
}
