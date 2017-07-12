/**
 * Q8)Write a program to accept a number and reverse its digits
*/

package july12;

import java.util.Scanner;

public class ReverseANum {

	private int n, a, reverse=0;
	
	public void getNumber()
	{
		Scanner src = new Scanner(System.in);
		System.out.println("Enter a number: ");
		n = src.nextInt();
		a = n;
	}
	
	public void reverse()
	{
		while(n!=0)
		{
			reverse = reverse * 10;
			reverse = reverse + n%10;
			n = n/10;
		}
		
		System.out.println("original number: "+a);
		System.out.println("New number: "+reverse);
	}
	
	public static void main(String args[])
	{
		ReverseANum x = new ReverseANum();
		x.getNumber();
		x.reverse();
	}
	
}
