package LinkedListExamples;

import java.util.*;

public class LinkedListEx {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();
		ll.add("V");
		ll.add("A");
		ll.add("I");
		ll.add("B");
		ll.add("H");
		ll.add("A");
		ll.add("V");
		
		ll.addFirst("Hi");
		ll.addLast("Hi");
		System.out.println(ll);
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
		
		System.out.println("Iterator Loop");
		Iterator<String> itr = ll.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}	
		
		System.out.println("For Loop");
		for(int i= 0;i<ll.size();i++){
			System.out.println(ll.get(i));
		}
		
		System.out.println("For Each Loop");
		for(String s:ll){
			System.out.println(s);
		}
		
		System.out.println("While Loop");
		int i=0;
		while (ll.size() > i) {
			System.out.println(ll.get(i));
			i++;
		}	
	}
}
