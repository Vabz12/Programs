package ArrayListExample;

import java.util.*;

public class ComparingArrayList {
	public static void main(String[] args) {
		
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("hi");
		al1.add("How are you");
		al1.add("Good Morning");
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("hi");
		al2.add("Brother");
		al2.add("Party!");
		
		//Storing the comparison in the List ...
		
		ArrayList<String> al = new ArrayList<String>();
		for(String t : al1)
			al.add(al2.contains(t) ? "Yes" : "No");
		System.out.println(al);
		
		ArrayList<Integer> ai = new ArrayList<Integer>();
		for(String i: al1)
			ai.add(al2.contains(i) ? 1 : 0);
		System.out.println(ai);
	}
}
