/**
 * ArrayList example
 * */

package myPackage;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListEx {

	public void getEmpList()
	{
		ArrayList<String> empname = new ArrayList<String>();
		empname.add("John");
		empname.add("Max");
		empname.add("Jim");
		empname.add("Kim");
		empname.add("Tim");
		empname.add("Jane");
		
		System.out.println("Employee names: ");
		Iterator i = empname.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
		ArrayList<Integer> empage = new ArrayList<Integer>();
		empage.add(23);
		empage.add(21);
		empage.add(24);
		empage.add(26);
		empage.add(23);
		empage.add(22);
		
		System.out.println("Employee ages: ");
		Iterator j = empage.iterator();
		while(j.hasNext()){
			System.out.println(j.next());
		}
		
	}
	
	public static void main(String args[]){
		ArrayListEx a = new ArrayListEx();
		a.getEmpList();
	}
	
}
