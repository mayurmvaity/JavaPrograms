package july21;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteFileEx {

	public void writeFile()
	{
		String fname = "D:\\workspace2\\TestReadFile.txt";
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try
		{
			fw = new FileWriter(fname);
			bw = new BufferedWriter(fw);
			
			bw.write("This is the first line.");
			bw.write("This is the 2nd line.");
			bw.write("This is the 3rd line.");
			bw.write("This is the 4th line.");
			bw.write("This is the 5th line.");
			
			bw.close();
			fw.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			try
			{
				if(fw!=null)
				{
					fw.close();
				}
				if(bw!=null)
				{
					bw.close();
				}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
	
	public static void main(String args[])
	{
		WriteFileEx x = new WriteFileEx();
		x.writeFile();
	}
	
}
