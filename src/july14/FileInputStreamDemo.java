/**
 * FileInputStream example from lecture
 * 
 * **/

package july14;

import java.io.FileInputStream;

public class FileInputStreamDemo {
	
	public static void main(String args[])
	{
		int i;
		char c;
		try(FileInputStream f = new FileInputStream("C:\\pgms\\test.txt");)
		{
			while((i=f.read())!= -1)
			{
				c = (char) i;
				System.out.print(c);
			}
		}
		catch(Exception e)
		{
			System.out.println("Error: "+e);
		}
	}

}
