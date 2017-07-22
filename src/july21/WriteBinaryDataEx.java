package july21;

import java.io.FileOutputStream;

public class WriteBinaryDataEx {

	public void writebdata()
	{
		String dataFile = "D:\\workspace2\\binData.txt";
		String byteData = "This is an example of binary data file.";
				
		byte[] buffer = byteData.getBytes();
		
		FileOutputStream fos = null;
		try
		{
			fos = new FileOutputStream(dataFile);
			fos.write(buffer);
			fos.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String args[])
	{
		WriteBinaryDataEx x = new WriteBinaryDataEx();
		x.writebdata();
	}
	
}
