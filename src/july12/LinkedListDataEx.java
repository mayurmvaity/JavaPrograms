package july12;

import java.util.LinkedList;

public class LinkedListDataEx {

	public void getStuDetails()
	{
		Student s1 = new Student("Tim",12,"Kolkata","WB");
		Student s2 = new Student("john",13,"mumbai","MH");
		Student s3 = new Student("james",13,"chennai","TB");
		Student s4 = new Student("jason",14,"delhi","DL");
		Student s5 = new Student("jill",11,"goa","GOA");
		
		LinkedList<Student> ll = new LinkedList<Student>();
		ll.add(s1);
		ll.add(s2);
		ll.add(s3);
		ll.add(s4);
		ll.add(s5);
		
		for(Student stu : ll)
		{
			System.out.println("Name: "+stu.name+", Age: "+stu.age+", City: "+stu.city+", State: "+stu.state);
			/*System.out.println("Age: "+stu.age);
			System.out.println("City: "+stu.city);
			System.out.println("State: "+stu.state);*/
		}
		
	}
	
	public static void main(String args[])
	{
		LinkedListDataEx x = new LinkedListDataEx();
		x.getStuDetails();
	}
}

class Student
{
	String name;
	int age;
	String city;
	String state;
	
	public Student(String name, int age, String city, String state){
		this.name = name;
		this.age = age;
		this.city = city;
		this.state = state;
	}
}