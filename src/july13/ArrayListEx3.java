/**
 * Q5) Write a program to accept student details like id, name, age and city.
 * Accept the details of 10 students and count the number of students whose age is more than 21.
 * Display the total count of students who belong to similar city.
 * 
 * **/

package july13;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx3 {
	
	ArrayList<Stu> al4 = new ArrayList<Stu>();
	ArrayList<String> cities = new ArrayList<String>();
	ArrayList<CityCount> cc1 = new ArrayList<CityCount>();
	int ageCount;
	
	public void getStu()
	{
		Stu s1 = new Stu(1,"John",21,"Kolkata");
		Stu s2 = new Stu(2,"Kate",22,"Mumbai");
		Stu s3 = new Stu(3,"Jane",18,"Chennai");
		Stu s4 = new Stu(4,"Jason",19,"Mumbai");
		Stu s5 = new Stu(5,"Alex",24,"Kolkata");
		
		al4.add(s1);
		al4.add(s2);
		al4.add(s3);
		al4.add(s4);
		al4.add(s5);
		
		
	}
	
	public void display()
	{
		Iterator it = al4.iterator();
		while(it.hasNext())
		{
			Stu x = (Stu) it.next();
			System.out.println(x.id+" "+x.name+" "+x.age+" "+x.city);
		}
	}
	
	public void ageMoreThan21()
	{
		Iterator it1 = al4.iterator();
		while(it1.hasNext())
		{
			Stu x = (Stu) it1.next();
			if(x.age > 21)
			{
				ageCount++;
			}
		}
		
		System.out.println("number of People with age > 21: "+ageCount);
	}

	public void getDistinctCities()
	{
		int eqCount = 0;
		Iterator it = al4.iterator();
		while(it.hasNext())
		{
			Stu x = (Stu) it.next();
			for(int i=0;i<cities.size();i++)
			{
				if(x.city.equals(cities.get(i)))
				{
					eqCount++;
				}
			}
			if(eqCount==0)
			{
				cities.add(x.city);
				CityCount ct1 = new CityCount(x.city, 0);
				cc1.add(ct1);
			}
		}
		
		System.out.println(cities);
		
		// comment it after checking
		/*Iterator ic = cc1.iterator();
		while(ic.hasNext())
		{
			CityCount z = (CityCount) ic.next();
			System.out.println(z.cityName+" "+z.stuCount);
		}*/
	}
	
	void getSimilarCityStuCount()
	{
		Iterator it = al4.iterator();
		while(it.hasNext())
		{
			Stu st = (Stu) it.next();
			for(int i=0;i<cc1.size();i++)
			{
				CityCount c = cc1.get(i);
				if(st.city.equals(c.cityName))
				{
					int count = c.stuCount;
					CityCount b = new CityCount(st.city,++count);
					cc1.set(i, b);
				}
			}
		}
		
		System.out.println("total count of students who belong to similar city:");
		Iterator ic = cc1.iterator();
		while(ic.hasNext())
		{
			CityCount z = (CityCount) ic.next();
			System.out.println(z.cityName+" "+z.stuCount);
		}
	}
	
	public static void main(String args[])
	{
		ArrayListEx3 x = new ArrayListEx3();
		x.getStu();
		x.display();
		x.ageMoreThan21();
		x.getDistinctCities();
		x.getSimilarCityStuCount();
	}
	
}

class Stu {
	int id;
	String name;
	int age;
	String city;
	public Stu(int id, String name, int age, String city)
	{
		this.id = id;
		this.name = name;
		this.age = age;
		this.city = city;
	}
}

class CityCount
{
	String cityName;
	int stuCount;
	
	CityCount(String cityName, int stuCount)
	{
		this.cityName = cityName;
		this.stuCount = stuCount;
	}
}