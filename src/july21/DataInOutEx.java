package july21;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInOutEx {

	public void dataInOut()
	{
		float prices[] = {19.99f,9.99f};
		int[] units = {12,8};
		String descriptions[] = {"Test 1","Test 2"};
		float total = 0;
		
		try
		{
			DataOutputStream dis = new DataOutputStream(new FileOutputStream("D:\\workspace2\\dataIOTestFile.txt"));
			
				for(int i=0;i<prices.length;i++)
				{
					dis.writeFloat(prices[i]);
					dis.writeChar('\t');
					
					dis.writeInt(units[i]);
					dis.writeChar('\t');
					
					dis.writeUTF(descriptions[i]);
					dis.writeChar('\t');
				
				}
				
			DataInputStream ins = new DataInputStream(new FileInputStream("D:\\workspace2\\dataIOTestFile.txt"));
			
			int i = 0;
			
			while(i<prices.length)
			{
				float price = ins.readFloat();
				ins.readChar();
				//System.out.println(price);
				
				int unit = ins.readInt();
				ins.readChar();
				//System.out.println(unit);
				
				String desc = ins.readUTF();
				ins.readChar();
				//System.out.println(desc);
				
				System.out.println("Order is made of "+unit+" of "+desc+" costing: "+unit*price);
				
				total = total +(unit*price);
				
				i++;
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		System.out.println("Total price is: "+total);
	}
	
	public static void main(String args[])
	{
		DataInOutEx x = new DataInOutEx();
		x.dataInOut();
	}
}
