package HashTableExample;

import java.util.*;

public class HashTableEx {

	public static void main(String[] args) {
	
		Hashtable<Integer, String> ht = new Hashtable<>();
		ht.put(7,"V");
		ht.put(3,"I");
		ht.put(4,"B");
		ht.put(2,"A");
		ht.put(6,"A");
		ht.put(5,"H");
		ht.put(1,"V");
	
		for(Map.Entry m: ht.entrySet()){
		System.out.println("Key : "+m.getKey() + " Value : " +m.getValue());
		}
	}

}
