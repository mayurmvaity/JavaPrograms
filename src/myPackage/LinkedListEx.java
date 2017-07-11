/**
 * Linked List example
 * */


package myPackage;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx {

	LinkedList<String> ll = new LinkedList<String>();
	public void addToLL()
	{
		ll.add("John");
		ll.add("Max");
		ll.add("Sean");
		ll.add("Jason");
		ll.add("Carl");
		ll.add("John");
	
		System.out.println("List: "+ll);
		
		ll.add(3,"Roman");
		
		System.out.println("List: "+ll);
		
		ll.addFirst("Elizabeth");
		
		System.out.println("List: "+ll);
		
		ll.addLast("Jane");
		
		System.out.println("List: "+ll);
		
		LinkedList<String> ll2 = (LinkedList<String>) ll.clone();
		
		System.out.println("List2: "+ll2);
		
		System.out.println("Element() :"+ll.element());
		
		System.out.println("get(index): "+ll.get(2));
		System.out.println("getFirst(): "+ll.getFirst());
		System.out.println("getLast(): "+ll.getLast());
		
		System.out.println("indexOf(element): "+ll.indexOf("John"));
		System.out.println("lastIndexOf(element): "+ll.lastIndexOf("John"));
		
		System.out.println("Size: "+ll.size());
		
		System.out.println("List: "+ll);
		
		System.out.println("peek(): "+ll.peek());
		System.out.println("peekFirst(): "+ll.peekFirst());
		System.out.println("peekLast(): "+ll.peekLast());
		
		System.out.println("List: "+ll);
		
		System.out.println("poll(): "+ll.poll());
		System.out.println("pollFirst(): "+ll.pollFirst());
		System.out.println("pollLast(): "+ll.pollLast());
		
		
		System.out.println("List: "+ll);
		
		
		
	}
	
	public static void main(String args[]){
		LinkedListEx x = new LinkedListEx();
		x.addToLL();
	}
	
}
