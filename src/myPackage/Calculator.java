/**
 * Q1) Write a program to create four functionsfor Addition, Subtraction, Multiplication and Division. 
 * */


package myPackage;

public class Calculator {

	public int addition(int a, int b)
	{
		return (a+b);
	}
	
	public int subtraction(int a, int b)
	{
		return (a-b);
	}
	
	public int multiplication(int a, int b)
	{
		return (a*b);
	}
	
	public double division(int a, int b)
	{
		return (a/b);
	}
	
	public static void main(String args[])
	{
		Calculator x = new Calculator();
		int sum = x.addition(10,20);
		int sub = x.subtraction(10, 20);
		int product = x.multiplication(10, 20);
		double div = x.division(10, 20);
		
		System.out.println("Addition: "+sum);
		System.out.println("Subtraction: "+sub);
		System.out.println("Multiplication: "+product);
		System.out.println("Division: "+div);
		
	}
}
