package HashmapExample;

import java.util.*;

public class HashMapEx {

	public static void main(String args[]) {
		
    //Create hash-map ...
	
	HashMap< Integer, String> hmap = new HashMap<Integer,String>();
	 hmap.put(1,"Vaibhav");
	 hmap.put(4, "Kashyap");
	 hmap.put(3, "Chintan");
	 hmap.put(2, "Rocky");
	 
	 
	 Map m = Collections.synchronizedMap(hmap);
	 Set set = m.entrySet();
	 
	 synchronized (m) {
		 Iterator itr = set.iterator();
		 
		 
		 //Iterator and while loop ...
		 while(itr.hasNext())
		 {
			 Map.Entry<Integer, String> mentry = (Map.Entry)itr.next();
			 System.out.println("Key : "+mentry.getKey() + " &  Value is : "+mentry.getValue());	
		 }	
		 System.out.println();
		 
	}
	 
	 System.out.println("..... FOR LOOP .....");
	 //By For loop ....
	 for(int i = 0; i< hmap.size();i++){
		 System.out.println("The Elements are : "+hmap.values());
		 System.out.println();
	 }
	 
	 HashMap< Integer, String> hmap1 = new HashMap<Integer,String>();
	 hmap1.putAll(hmap);
	 
	 Set set1 = hmap1.entrySet();
	 Iterator itrt = set1.iterator();
	 while(itrt.hasNext())
	 {
		 Map.Entry<Integer, String> mentry = (Map.Entry)itrt.next();
		 System.out.println("Key : "+mentry.getKey() + " &  Value is : "+mentry.getValue());
	 }	
	 System.out.println();
	 // get value of index ...
	 System.out.println(" The Values after getting the values by index 2 is :  " + hmap.get(2));
	 // remove values at index ...
	 hmap.remove(3);
	 // Shows values and the size of map ...
	 System.out.println("Map value after removing element : " +hmap.values() + " & size is : "+ hmap.size());
	 //Shows key Set in Array elements ...
	 System.out.println("Elements in Map : "+hmap.keySet()+ " "+hmap.isEmpty());	 
	}
}
