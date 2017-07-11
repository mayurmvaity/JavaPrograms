/**
 * Q WAP to create user defined exception named as NumberGreaterException.
 * Accept number from user if it is greater than 10 then throw NumberGreaterException
 * */

package myPackage;

import java.util.*;

class Student2
{
String name;
int age;
String city;
String state;

}

public class AL1
{
ArrayList<Student2> st = new ArrayList<Student2>();

public void addToList()
{

Student2 s1 = new Student2();
s1.name = "ABC";
s1.age = 21;
s1.city = "Mumbai";
s1.state = "Maharashtra";

st.add(s1);

Student2 s2 = new Student2();
s2.name = "LMN";
s2.age = 24;
s2.city = "Pune";
s2.state = "Maharashtra";

st.add(s2);

Student2 s3 = new Student2();
s3.name = "PQR";
s3.age = 25;
s3.city = "Nashik";
s3.state = "Maharashtra";

st.add(s3);

}

public void display()
{
Iterator<Student2> i = st.iterator();
while(i.hasNext())
{
	Student2 c = i.next();
System.out.println(c.name+" "+c.age+" "+c.city+" "+c.state);
}
}

public static void main(String args[])
{
AL1 x = new AL1();
x.addToList();
x.display();
}

}