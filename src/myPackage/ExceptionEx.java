package myPackage;
import java.util.Scanner;
public class ExceptionEx
{
public void percentage()
{

Scanner src = new Scanner(System.in);

int num1=0;
int num2=0;
int num3=0;
int sum=0;
int percentValue=0;
try{
System.out.println("Enter num1:");
num1=src.nextInt();
System.out.println("Enter num2:");
num2=src.nextInt();
System.out.println("Enter num3:");
num3=src.nextInt();
System.out.println("Enter percent value:");
percentValue=src.nextInt();

sum = num1+num2+num3;
float per = sum/percentValue;

System.out.println("Percentage :"+per);
}
catch(Exception ex)
{
System.out.println(ex);
}
}

public void display()
{
System.out.println("Inside display method");
}

public static void main(String args[])
{
ExceptionEx x = new ExceptionEx();
x.percentage();
x.display();

}
}

