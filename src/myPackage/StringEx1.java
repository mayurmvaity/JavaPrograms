/*
 * Q Write a program to accept a string and display the last character of the string without using readymade string functions
 * **/

package myPackage;

import java.util.Scanner;

public class StringEx1 {
	
	private String str;
	
	public void getString()
	{
		Scanner src = new Scanner(System.in);
		System.out.println("Enter a string: ");
		str = src.next();
		
	}
	
	public char getLastChar(){
		int len = str.length();
		char ch = str.charAt(len-1);
		return ch;
	}
	
	public static void main(String args[]){
		StringEx1 x = new StringEx1();
		x.getString();
		char ch = x.getLastChar();
		System.out.println("Last char is: "+ch);
		
	}

}
