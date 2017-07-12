/**
 * Write a program to accept the string and replace the third char with 't'
 * */

package myPackage;

import java.util.Scanner;

public class StringEx2 {

	private String str;
	private String newStr;
	
	public void getString()
	{
		Scanner src = new Scanner(System.in);
		System.out.println("Enter a String: ");
		str = src.next();
		
	}
	
	public void replaceWithT()
	{
		char[] a = str.toCharArray();
		a[2] = 't';
		newStr = new String(a);
	}
	
	public void display(){
		System.out.println("Original string: "+str);
		System.out.println("New string: "+newStr);
	}
	
	public static void main(String args[])
	{
		StringEx2 x = new StringEx2();
		x.getString();
		x.replaceWithT();
		x.display();
	}
}
