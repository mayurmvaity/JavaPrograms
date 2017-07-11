/**
 * Q2 write a program to swap two numbers w/o using third variable
 * */


package myPackage;

import java.util.Scanner;

public class SwapTwoNums {

	int a,b;
	
	public void swap()
	{
	Scanner src = new Scanner(System.in);
	System.out.println("Enter value of a:");
	a = src.nextInt();
	
	System.out.println("Enter value of b:");
	b = src.nextInt();
	
	System.out.println("Current values:");
	System.out.println("a: "+a+" b: "+b);
	
	a=a+b;
	b=a-b;
	a=a-b;
	
	System.out.println("Values after swapping:");
	System.out.println("a: "+a+" b: "+b);
	
	}
	
	public static void main(String args[])
	{
		SwapTwoNums x = new SwapTwoNums();
		x.swap();
	}
	
}
