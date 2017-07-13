/**
 * Write a progam to maintain Employee details using arraylist?
 * add id, name, age, salary
 * 1) Add minimum 5 emp details
 * 2) Display it in proper order
 * 3) display the name of employee having highest salary
 * 4) display the list of emps in order of salary
 * **/

package july13;

import java.util.ArrayList;
import java.util.Iterator;

class Emp
{
int id;
String name;
int age;
double sal;


public Emp(int id, String name, int age, double sal)
{
this.id = id;
this.name = name;
this.age = age;
this.sal = sal;
}
}

public class EmpEx
{
ArrayList<Emp> al1 = new ArrayList<Emp>();
private Emp maxSalEmp;
private double maxSal;

public void addStu()
{
Emp s1 = new Emp(12,"John",25,25000);
Emp s2 = new Emp(13,"Max",23,27000);
Emp s3 = new Emp(15,"Jacob",24,28000);
Emp s4 = new Emp(17,"Roman",22,29000);
Emp s5 = new Emp(18,"Jane",21,25500);

al1.add(s1);
al1.add(s2);
al1.add(s3);
al1.add(s4);
al1.add(s5);

}

void getMaxSal()
{
Iterator it1 = al1.iterator();
	while(it1.hasNext())
	{
	Emp e1 = (Emp) it1.next();
		if(e1.sal > maxSal)
		{
		maxSal = e1.sal;
		maxSalEmp = e1;
		}
	}
	
	System.out.println("Max sal emp: "+maxSalEmp.id+" "+maxSalEmp.name+" "+maxSalEmp.age+" "+maxSalEmp.sal);
}

public void sortBySal()
{

Emp temp;

for (int i = 0; i < al1.size(); i++) 
        {
            for (int j = i + 1; j < al1.size(); j++) 
            {
                if (al1.get(i).sal > al1.get(j).sal) 
                {
                    temp = al1.get(i);
                    al1.set(i,al1.get(j));
                    al1.set(j, temp);
                }
            }
        }
}

public void display()
{
	Iterator it2 = al1.iterator();
	while(it2.hasNext())
	{
		Emp e3 = (Emp) it2.next(); 
		System.out.println(e3.id+" "+e3.name+" "+e3.age+" "+e3.sal);
	}
}



public static void main(String args[])
{
	EmpEx x = new EmpEx();
	x.addStu();
	x.getMaxSal();
	x.sortBySal();
	x.display();

}

}