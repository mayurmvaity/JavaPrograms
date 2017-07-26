/**
 * 4) Write a Program to find top 3 maximum numbers in an array of size 10.
 * **/

package july26;

import java.util.Arrays;
import java.util.Scanner;

public class Max3Nums {

	int n[]= new int[10];
	//int n[]= {55,36,44,22,59,12,44,32,84,12};
	public void getNums()
	{
		Scanner src = new Scanner(System.in);
		System.out.println("Enter array elements: ");
		for(int i=0;i<10;i++)
		{
			System.out.print("Entere ele num: "+(i+1)+": ");
			n[i]=src.nextInt();
		}
	}
	
	public void getTop3Nums()
	{
		Arrays.sort(n);
		for(int i= (n.length-1);i>(n.length-4);i--)
		{
			System.out.print(n[i]+", ");
		}
	}
	
	public static void main(String args[])
	{
		Max3Nums x = new Max3Nums();
		x.getNums();
		x.getTop3Nums();
	}
	
}
