package VectorExample;

import java.util.*;

public class VectorEx {

	public static void main(String[] args) {
		
		Vector< String > vec = new Vector<String>(2);
		vec.addElement("Hi");
		vec.addElement("Hello");
		vec.addElement("Hi");
		System.out.println(vec);
		System.out.println(vec.size());
		
		vec.removeElement("Hi");
		System.out.println(vec);
	}
}
