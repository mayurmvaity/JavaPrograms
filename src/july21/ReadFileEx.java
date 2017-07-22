package july21;

import java.io.FileReader;

public class ReadFileEx {

	public void readFile()
	{
		try
		{
			FileReader obj = new FileReader("D:\\workspace2\\testFile.txt");
			char[] filedata = new char[100];
			obj.read(filedata);
			
			for(char ch: filedata)
			{
				System.out.print(ch);
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String args[])
	{
		ReadFileEx x= new ReadFileEx();
		x.readFile();
	}
	
}
