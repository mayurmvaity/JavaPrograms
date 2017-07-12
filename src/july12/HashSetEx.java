/**
 * Hash set example
 * */

package july12;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
	
	public void empDetails()
	{
		HashSet<Emp1> emp = new HashSet<Emp1>();
		
		Emp1 e1 = new Emp1("John",21,"Mumbai");
		Emp1 e2 = new Emp1("Tim",22,"Kolkata");
		Emp1 e3 = new Emp1("Carl",24,"Delhi");
		Emp1 e4 = new Emp1("Tommy",25,"Goa");
		
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		
		Iterator i1 = emp.iterator();
		while(i1.hasNext())
		{
			Emp1 ex = (Emp1) i1.next();
			System.out.println(ex.name+" "+ex.age+" "+ex.city);
		}
		
	}
	
	public static void main(String args[])
	{
		HashSetEx h1 = new HashSetEx();
		h1.empDetails();
	}

}

class Emp1
{
	String name;
	int age;
	String city;
	
	public Emp1(String name, int age, String city)
	{
		this.name = name;
		this.age = age;
		this.city = city;
	}
}