/**
 * Q - Try with resources example
 * */


package myPackage;
import java.util.Scanner;
public class TryWithResources
{
String name;
int age;
public void checkAge()
{
try(Scanner src = new Scanner(System.in);)
{
System.out.println("Enter name:");
name=src.nextLine();

System.out.println("Enter age: ");
age=src.nextInt();

if(age>=40)
{
throw new AgeExcepn("age should not be greater than or equal to 40");
}

}
catch(AgeExcepn ex)
{
System.out.println(ex);
}

}

public static void main(String args[])
{
TryWithResources x = new TryWithResources();
x.checkAge();
}


}

class AgeExcepn extends Exception
{
public AgeExcepn(String message)
{
super(message);
}

}