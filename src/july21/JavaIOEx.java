package july21;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;

public class JavaIOEx {
	
	public void readData()
	{
		String mydata = "This is some test data.";
		byte buf[] = mydata.getBytes();
		
		try(ByteArrayInputStream in = new ByteArrayInputStream(buf);
				BufferedInputStream bis = new BufferedInputStream(in);)
		{
			int c;
			while((c=bis.read())!=-1)
			{
				System.out.print((char)c);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
	public static void main(String args[])
	{
		JavaIOEx x = new JavaIOEx();
		x.readData();
	}

}
