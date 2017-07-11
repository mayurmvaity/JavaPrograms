package myPackage;

import java.util.ArrayList;
import java.util.Iterator;

class Student1 {
	int id;
	String name;
	int age;
	
	public Student1(int id, String name, int age){
		this.id = id;
		this.name = name;
		this.age = age;
	}
}

public class TestCollection3 {

	public static void main(String args[]){
		ArrayList<Student1> al1 = new ArrayList<Student1>();
		
		Student1 s1 = new Student1(101,"Sonoo",23);
		Student1 s2 = new Student1(102,"Ravi",21);
		Student1 s3 = new Student1(103,"Hemant",22);
		
		al1.add(s1);
		al1.add(s2);
		al1.add(s3);
		
		Iterator i1 = al1.iterator();
		while(i1.hasNext()){
			Student1 st = (Student1) i1.next();
			System.out.println(st.id+" "+st.name+" "+st.age);
		}
		
		
		
	}
	
}
