package TreeSetExample;

import java.util.*;

public class TreeSetEx {

	public static void main(String[] args) {
		
		TreeSet<String> t = new TreeSet<>();
		t.add("V");
		t.add("A");
		t.add("I");
		t.add("B");
		t.add("H");
		t.add("A");
		t.add("V");				
		
		System.out.println(t);
		
		TreeSet< Integer> t1 = new TreeSet<>();
		t1.add(1);
		t1.add(2);
		t1.add(3);
		t1.add(4);
		t1.add(5);
		t1.add(6);
		t1.add(1);
		
		System.out.println(t1);
		
	}

}
