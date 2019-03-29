package TreeMapExample;

import java.util.*;

public class TreeMapEx {

	public static void main(String[] args) {
		//Create Tree Map ...
		TreeMap<String, String > tm = new TreeMap<>();
				tm.put("Hi","Vaibhav");
				tm.put("Hello", "Vaibhav");
				tm.put("Hola","Vaibhav");
				
			Map t = Collections.synchronizedMap(tm);
			Set s = t.entrySet();
			
			synchronized (s) {
			Iterator itr = s.iterator();
			while(itr.hasNext()){
				Map.Entry<String, String> me = (Map.Entry) itr.next();
				System.out.println("The Key is : "+ me.getKey() + " Value is : "+me.getValue() );
				System.out.println();
			}
			
			System.out.println(tm.remove("Hi","Vaibhav"));
			System.out.println(tm.keySet() + ""+tm.values());
						
			}	
	}
}
