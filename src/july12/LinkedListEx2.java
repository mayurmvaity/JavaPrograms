/***
 * Lecture linkedlist example
 * 
 * **/

package july12;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListEx2 {
	
	public void empDetails()
	{
		LinkedList ll = new LinkedList();
		ll.add("tim");
		ll.add("Jim");
		ll.add("kim");
		
		System.out.println(ll);
		
		System.out.println("Add first david:");
		ll.addFirst("david");
		System.out.println(ll);
		
		System.out.println("Add last john:");
		ll.addLast("John");
		System.out.println(ll);
		
		System.out.println("get 3: "+ll.get(3));
		
		
		System.out.println("get first fn: "+ll.getFirst());
		
		System.out.println("get last fn: "+ll.getLast());
		
		System.out.println("Straight iterator:");
		ListIterator li = ll.listIterator();
		while(li.hasNext())
		{
			System.out.print(li.next()+", ");
		}
		System.out.println();
		
		System.out.println("reverse iterator:");
		ListIterator pli = ll.listIterator();
		while(li.hasPrevious())
		{
			System.out.print(li.previous()+", ");
		}
		System.out.println();
	}

	public static void main(String args[])
	{
		LinkedListEx2 x = new LinkedListEx2();
		x.empDetails();
	}
	
}
