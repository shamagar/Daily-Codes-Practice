//This code is demonstration on FileOutPutStream

package FileOutPutStreamDemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class LunchFileOutPutStream
{
    public static void main(String[] args) throws IOException
    {
        //File Location
        String fileLocation = "/Users/shamagar/Desktop/file/Text.txt";

        //Using try with resource
        try(FileOutputStream fos = new FileOutputStream(fileLocation))
        {
            //fos = new FileOutputStream(fileLocation);
            String str = "Learn Java Programming.";
            //Convert the given String into byteAarry to store in a file
            byte[] b = str.getBytes();
            fos.write(b);

            // Another way to write
            //Writing character by character using foreach loop
            /*
            for(byte a : b)
                fos.write(a);
             */

            //Writing on file with index and its length
            fos.write(b, 6,b.length-6);

            //Close the source
            fos.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e);
            //e.printStackTrace();
        } catch (IOException e)
        {
            throw new RuntimeException(e);
        }

        /*
        finally
        {
            fos.close();
        }

         */
    }
}
