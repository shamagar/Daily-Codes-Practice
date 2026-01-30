//This code is all bout CharArrayReader
import java.io.CharArrayReader;
import java.io.IOException;

public class LunchCharArrayReader
{
    public static void main(String[] args) throws IOException
    {
       char[] c = {'a', 'e', 'i', 'o', 'u'};

       //Initializing the CharArrayReader
        CharArrayReader cr = new CharArrayReader(c);
        //Reading all the data
        int x;
        while((x = cr.read()) != -1)
        {
            System.out.print((char)x+" ");
        }
        //Closing the resource
        cr.close();
    }
}
