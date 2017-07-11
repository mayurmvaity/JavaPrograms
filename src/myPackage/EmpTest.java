/**
 * Q6) Write a program to accept details of 10 employees like id, name, age, salary, department.
* Display the name of the employee who earns maximum
* Display the name of the employee who is elder of them all
* */


package myPackage;

import java.util.ArrayList;
import java.util.Scanner;

class Emp1
{
	private int id;
	private String name;
	private int age;
	private double salary;
	private String dept;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
}

public class EmpTest {
	
	Scanner src = new Scanner(System.in);
	ArrayList al2 = new ArrayList();
	
	private int id;
	private String name;
	private int age;
	private double sal;
	private String dept;
	Emp1 e1 = new Emp1();
	
	double max = 0;
	String maxEarner;
	String elderName;
	double elder = 0;
	
	public void getEmp()
	{
		
		for(int i=0;i<10;i++){
			System.out.println("Enter data for employee number: "+(i+1));
			
			System.out.println("Enter emp id: ");
			id = src.nextInt();
			
			
			System.out.println("Enter emp name: ");
			name = src.next();
			
			System.out.println("Enter emp age: ");
			age = src.nextInt();
			
			System.out.println("Enter emp sal: ");
			sal = src.nextDouble();
			
			System.out.println("Enter emp dept: ");
			dept = src.next();
			
			e1.setId(id);
			e1.setName(name);
			e1.setAge(age);
			e1.setSalary(sal);
			e1.setDept(dept);
			
			if(sal>max)
			{
				max=sal;
				maxEarner = name;
			}
			
			if(age>elder)
			{
				elder = age;
				elderName = name;
			}
			
			al2.add(e1);
			
		}
		
		System.out.println("Elder of them all: "+elderName);
		System.out.println("Person who earns the most: "+maxEarner);
		
		
	}
	
	public static void main(String args[]){
		EmpTest ex = new EmpTest();
		ex.getEmp();
	}
}
