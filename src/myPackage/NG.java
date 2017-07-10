package myPackage;
import java.util.Scanner;
public class NG
{
public void getNumber() throws NumberGreaterException
{
Scanner src = new Scanner(System.in);
System.out.println("Enter a number: ");
int num = src.nextInt();

System.out.println("Entered number is: "+num);
if(num>10)
{
throw new NumberGreaterException("number greater than 10");
}


}

public static void main(String args[])
{
NG x = new NG();
try{
	x.getNumber();
	
}
catch(NumberGreaterException n)
{
	System.out.println(n);
}
}

}

class NumberGreaterException extends Exception
{
public NumberGreaterException(String message)
{
super(message);
}
}
