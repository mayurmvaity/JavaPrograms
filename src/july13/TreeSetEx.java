/**
 * Q. treeSet example from lecture
 * 
 * **/

package july13;

import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetEx {

	public void EmpDetails()
	{
		TreeSet<String> emp = new TreeSet<String>();
		emp.add("john");
		emp.add("jane");
		emp.add("jason");
		emp.add("Max");
		emp.add("kim");
		emp.add("jennifer");
		emp.add("Kyle");
		
		Iterator it2 = emp.iterator();
		
		while(it2.hasNext())
		{
			System.out.println(it2.next());
			
			
		}
		
		
	}
	
	public static void main(String args[])
	{
		TreeSetEx ts1 = new TreeSetEx();
		ts1.EmpDetails();
	}
	
}
