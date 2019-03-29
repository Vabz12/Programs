package basic;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicatesFromArraylist {

	
	public static void main(String[] args) {
		removeDuplicates();
	}
	
	static void removeDuplicates(){
	
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(4);
		list.add(6);
		list.add(1);
		
		System.out.println("Array List Elements are : "+ list);
		HashSet<Integer> set  = new HashSet<>(list);
		System.out.println("Duplicates are Removed  : "+set);
		
		
	}
}

