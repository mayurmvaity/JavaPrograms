/**
 * Q9) Write a menu driven program for operating a calculator:
 *  1) Addition, 2) Subtraction, 3) Multiplication 4) Division 5) Percentage 6) Exit
 * */

package july12;

import java.util.Scanner;

public class Calculator2 {

	private static boolean flag = true ;
	private int option, a, b, result;
	private double re;
	Scanner src = new Scanner(System.in);
	
	
	public void getOption()
	{
		System.out.println("------------------");
		System.out.println("Calculator: ");
		System.out.println("Select an option: 1)Addition 2)Subtraction 3)Multiplication 4)Division 5)Percentage 6)Exit");
		option = src.nextInt();
		switch(option)
		{
		case 1: getInput(); addition(); toContinue(); break;
		case 2: getInput(); subtraction(); toContinue(); break;
		case 3: getInput(); multplication(); toContinue(); break;
		case 4: getInput(); division(); toContinue(); break;
		case 5: getInput(); percentage(); toContinue(); break;
		case 6: exitFn(); break;
		default: System.out.println("Wrong input plz try again!!");
		}
	}
	
	public void getInput()
	{
		System.out.print("Enter first number: ");
		a = src.nextInt();
		System.out.print("Enter second number: ");
		b = src.nextInt();
	}
	
	public void addition()
	{
		result = a + b;
		System.out.println("Addition: "+result);
	}
	
	public void subtraction()
	{
		result = a - b;
		System.out.println("subtraction: "+result);
	}
	
	public void multplication()
	{
		re = a * b;
		System.out.println("multplication: "+re);
	}
	
	public void division()
	{
		re = (double)a / (double) b;
		System.out.println("division: "+re);
	}
	
	public void percentage()
	{
		re = (double) (((double) a / (double) b) * 100d);
		System.out.println("percentage: "+re+"%");
	}
	
	
	public void toContinue()
	{
		System.out.print("Do you want to continue? Y/N: ");
		char ch = src.next().charAt(0);
		
		if(ch == 'Y' || ch == 'y')
		{
			flag = true;
		}
		else if(ch == 'N' || ch == 'n') {
			flag = false;
			System.out.println("You are exiting...");
		}
		else 
			{
			System.out.println("invalid input!!");
			flag = true;
			}
	}
	
	public void exitFn()
	{
		flag = false;
		System.out.println("You chose to exit...");
	}
	
	public static void main(String args[])
	{
		Calculator2 c = new Calculator2();
		while(flag)
		{
			c.getOption();
		}
	}
}
