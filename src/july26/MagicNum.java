/**
 * 3)  Write a program to check whether accepted number is Magic number.
 * **/

package july26;

import java.util.Scanner;

public class MagicNum {

	int a;
	
	public void getNum()
	{
		Scanner src = new Scanner(System.in);
		System.out.println("Enter a num: ");
		a = src.nextInt();
		
		System.out.println("ENtered value: "+a);
		
		this.checkMagic(a);
	}
	
	public void checkMagic(int b)
	{
		int m=b,n=0,sum=0;
		while(m>0)
		{
			n=m%10;
			sum = sum + n;
			m = m / 10;
		}
		System.out.println("part : "+sum);
		
		if(sum>9)
		{
			this.checkMagic(sum);
		}
		else if(sum==1)
		{
			System.out.println(a+" is a magic num!");
		}
		else
		{
			System.out.println(a+" isnt a Magic num!!!!");
		}
	}
	
	public static void main(String args[])
	{
		MagicNum x = new MagicNum();
		x.getNum();
	}
	
}
