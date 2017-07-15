/**
 * InputStreamReader, BufferedReader example from lecture
 * 
 * **/

package july14;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderDemo {

	public static void main(String args[])
	{
		String name;
		int age;
		try{
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			
			System.out.println("Enter name: ");
			name= br.readLine();
			
			System.out.println("Enter age: ");
			age = Integer.parseInt(br.readLine());
			
			System.out.println("Name: "+name+" age: "+age);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
