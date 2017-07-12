/*
 * Write a program to accept a string and check whether the 3rd character of string is 'S or not 
 * **/

package myPackage;

import java.util.Scanner;

public class StringEx3 {
	
	private String str;
	
	public void getString()
	{
		Scanner src = new Scanner(System.in);
		System.out.println("Enter a String: ");
		str = src.next();
		
	}
	
	public void check(){
		char []a = str.toCharArray();
		char ch = a[2];
		
		if(ch == 's' || ch == 'S')
		{
			System.out.println("Third char is \'s\'");
		}
		else
		{
			System.out.println("Third char is not \'s\'");
		}
	}
	
	public static void main(String args[])
	{
		StringEx3 x = new StringEx3();
		x.getString();
		x.check();
	}
	
}
