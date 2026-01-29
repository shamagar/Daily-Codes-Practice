//This code is demonstration on how to copy the data from existing file into new file by converting to lower case to
//Uppercase and vice versa
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class LunchCopyingFile
{
	public static void main(String[] args)
	{
		/*
		Note:For method 1 we need to throw the Exception from the main method
		//Method 1
		FileInputStream fis = new FileInputStream("/Users/shamagar/Desktop/file/Source1.txt");
		FileOutputStream fos = new FileOutputStream("/Users/shamagar/Desktop/file/Source2.txt");
		int c;
		while ((c = fis.read()) != -1)
		{
			if(c >= 65 && c <= 90)
				fos.write(c+32);
			else
				fos.write(c);
		}
		fis.close();
		fos.close();
		 */

		//Method 2 is the best with try with resource
		try(FileInputStream fis = new FileInputStream("/Users/shamagar/Desktop/file/Text.txt"))
		{
			//It will provide the actual data or byte and store in a byte array
			byte[] b = new byte[fis.available()];
			fis.read(b);
			//Convert byte array data into String
			String s = new String(b);

			//Copying the data to another file
			FileOutputStream fos = new FileOutputStream("/Users/shamagar/Desktop/file/TextCopy.txt");
			fos.write(s.toLowerCase().getBytes());

			//Closing the resource
			fis.close();
			fos.close();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
            throw new RuntimeException(e);
        }

    }
}
