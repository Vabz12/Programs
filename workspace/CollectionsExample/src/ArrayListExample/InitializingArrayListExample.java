package ArrayListExample;

import java.util.*;

public class InitializingArrayListExample {

	public static void main(String[] args) {

		//Normal way to initialize a list ...
		ArrayList< String > alist = new ArrayList<String>();
		alist.add("Hi");
		alist.add("Hello");
		alist.add("How r u ?");
		
		System.out.println("The Elements in the list are "+alist);
		
		
		
		// Initializing as Arraus.asList ...
		ArrayList<String> al = new ArrayList<String>(Arrays.asList("Vaibhav", "Rock", "Raj", "Harsh"));
		System.out.println(al);
		
		// Anonymous inner Class method to initialize list ...
		ArrayList<String> a = new ArrayList<String> (){{
			add("Fremont");
			add("SFO");
			add("San Jose");
		}};
		System.out.println("Cities are : "+a);
		
		// Initialize by using the method Collections.ncopies ...
		ArrayList<Integer> intList = new ArrayList<Integer>(Collections.nCopies(5, 2));
		System.out.println(intList);	
	}
}
