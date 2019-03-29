package ArrayListExample;

import java.util.*;

public class LoopingExamplesArrayList {

	public static void main(String[] args) {
	
		ArrayList<String> al = new ArrayList<String>();
		al.add("Hi");
		al.add("How");
		al.add("Vaibhav");
		al.add("is");
		al.add("doing");
		
		//Using for loop ...
		
		for(int c= 0; c<al.size();c++){
			System.out.println(al); 
		}
		System.out.println();
		//Using while loop ...
		
	   System.out.println("While loop ...");
	   System.out.println();
	   int c = 0;
	   
	   while(al.size() > c){
		   System.out.println(al.get(c));
		   c++;
	   }
	   
	   System.out.println();
        //Using Iterator loop ...
	   System.out.println("Iterator loop ...");
	   System.out.println();
	   Iterator<String> ir = al.iterator();
	   while (ir.hasNext()) {
		System.out.println(ir.next());
	}
	   
	  // Using Enumeration interface ....
	   Enumeration<String> e = Collections.enumeration(al);
	   System.out.println();
	   System.out.println("Enumerated Elements ... ");
	   System.out.println();
	   
	   while (e.hasMoreElements()) {
		System.out.println(e.nextElement());
	}
	}
}
