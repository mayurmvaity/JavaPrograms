package myPackage;
import java.util.Scanner;

public class UserDefinedEx
{
public void checkAge() throws AgeException
{
String name;
int age;

Scanner src = new Scanner(System.in);
System.out.println("Enter name:");
name=src.nextLine();

System.out.println("Enter age:");
age=src.nextInt();

if(age>=40)
{
throw new AgeException("Age should not be greater than 40");
}

}

public static void main(String args[]) throws AgeException
{
UserDefinedEx x = new UserDefinedEx();
x.checkAge();

}


}

class AgeException extends Exception
{
public AgeException(String message)
{
super(message);
}

}