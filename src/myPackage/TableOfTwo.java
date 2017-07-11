/**
 * Q2) Write a program to display table of 2.
 * */

package myPackage;

public class TableOfTwo {
	
	public void table(int a)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.print(a*i+" ");
		}
		System.out.println();
	}
	
	public static void main(String args[])
	{
		TableOfTwo x = new TableOfTwo();
		x.table(2);
	}

}
