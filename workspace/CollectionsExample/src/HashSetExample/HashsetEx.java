package HashSetExample;

import java.util.*;

public class HashsetEx {

	public static void main(String[] args) {
	
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("Hi");
		hs.add("Hi1");
		hs.add("Abc");
		
		//The duplicate values wouldn't be added in the set.
		
		hs.add("Hi");		
		System.out.println(hs);
		
		//Converting hashset to treeset ...
		TreeSet<String> ts = new TreeSet<String>(hs);
		for(String t : ts){
			System.out.println(t);
		}
	}
}
