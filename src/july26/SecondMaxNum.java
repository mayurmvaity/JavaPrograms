/**
 * 1) Program to find second highest number in an integer array without sorting the elements.
 * **/

package july26;

public class SecondMaxNum {

	
	
	public void getNums()
	{
		int[] a = {25,63,99,11,22,47,85,58,42};
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		
		int[] b= new int[a.length-1];
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			if(max!=a[i])
			{
			b[j]=a[i];
			j++;
			}
			else
			{
				continue;
			}
		}
		
		// displaying arrays
		this.displayArray(a);
		this.displayArray(b);
		
		// calling getMax fn
		int m=this.findMax(b);
		System.out.println("Second heighest int: "+m);
	}
	
	public void displayArray(int []a)
	{
		for(int x: a)
		{
			System.out.print(x+", ");
		}
		System.out.println();
	}
	
	public int findMax(int a[])
	{
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		SecondMaxNum ax = new SecondMaxNum();
		ax.getNums();
	}
}
