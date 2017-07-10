package myPackage;

import java.util.Scanner;

public class SumOfTenNums {

	int sum=0;
	
	public void sum()
	{
		Scanner src = new Scanner(System.in);
		for(int i=1;i<=10;i++)
		{
			System.out.println("Enter number: "+i);
			int a = src.nextInt();
			sum += a;
			
		}
		
		System.out.println("Sum is: "+sum);
	}
	
	public static void main(String args[])
	{
		SumOfTenNums x = new SumOfTenNums();
		x.sum();
	}
	
}
