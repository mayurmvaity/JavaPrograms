/**
 * WAP to perform all the operations related to HashMap
 * 1) Store emp details using emp class
 * 2) traverse emp details stored in collection object
 * 3) Delete emp details
 * 4) Update emp details
 * **/

package july13;

import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;

public class HashMapQ {
	
	HashMap<Integer, Emp1> h1 = new HashMap<Integer, Emp1>();
	
	public void getEmp()
	{
		Emp1 e1 = new Emp1(1,"John", 23, 20000);
		Emp1 e2 = new Emp1(2,"Jane", 24, 23000);
		Emp1 e3 = new Emp1(3,"Jacob", 26, 27000);
		Emp1 e4 = new Emp1(4,"Elizabeth", 22, 29000);
		Emp1 e5 = new Emp1(5,"Patrick", 21, 28000);
		
		h1.put(1001, e1);
		h1.put(1002, e2);
		h1.put(1003, e3);
		h1.put(1004, e4);
		h1.put(1005, e5);
		
		
		
	}
	
	public void display()
	{
		System.out.println("All entries: ");
		Set st = h1.entrySet();
		Iterator it = st.iterator();
		while(it.hasNext())
		{
			Map.Entry me = (Map.Entry) it.next();
			Emp1 ek =(Emp1) me.getValue();
			System.out.println(me.getKey()+" "+ek.id+" "+ek.name+" "+ek.age+" "+ek.sal);
		}
		
	}
	
	public void delete(Integer i)
	{
		Emp1 hc = (Emp1) h1.remove(i);
		System.out.println("remove 1005: "+hc.id+" "+hc.name+" "+hc.age+" "+hc.sal);
	}
	
	public void update(Integer i)
	{
		Emp1 eup = new Emp1(6,"Brucie", 26, 29300);
		h1.remove(i);
		h1.put(i, eup);
		Emp1 ef = h1.get(i);
		System.out.println("changed data: "+ef.id+" "+ef.name+" "+ef.age+" "+ef.sal);
	}
	
	public static void main(String args[])
	{
		HashMapQ x = new HashMapQ();
		x.getEmp();
		x.display();
		x.delete(1005);
		x.update(1002);
	}

}

class Emp1
{
	int id;
	String name;
	int age;
	double sal;
	
	public Emp1(int id, String name, int age, double sal)
	{
		this.id = id;
		this.name = name;
		this.age = age;
		this.sal = sal;
	}
}