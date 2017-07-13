/**
 * HashMap example from lecture
 * 
 * **/

package july13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
	
	public void getCustDetails()
	{
		HashMap<Integer, String> hm1 = new HashMap<Integer, String>();
		
		hm1.put(1001, "John");
		hm1.put(1002, "david");
		hm1.put(1003, "vijay");
		hm1.put(1004, "tim");
		hm1.put(1005, "sirini");
		hm1.put(1006, "vikas");
		hm1.put(1007, "vishal");
		
		Set st = hm1.entrySet();
		
		Iterator it1 = st.iterator();
		while(it1.hasNext())
		{
			
			Map.Entry me = (Map.Entry) it1.next();
			
			System.out.println("Key: "+me.getKey()+" Value: "+me.getValue());
		}
		
		System.out.println("get 1004: "+hm1.get(1004));
		
		hm1.remove(1003);
		System.out.println();
		System.out.println("After remove 1003: ");
		Set st2 = hm1.entrySet();
		
		Iterator it2 = st.iterator();
		while(it2.hasNext())
		{
			
			Map.Entry me = (Map.Entry) it2.next();
			
			System.out.println("Key: "+me.getKey()+" Value: "+me.getValue());
		}
		
		
	}
	
	public static void main(String args[])
	{
		HashMapEx x = new HashMapEx();
		x.getCustDetails();
	}

}
