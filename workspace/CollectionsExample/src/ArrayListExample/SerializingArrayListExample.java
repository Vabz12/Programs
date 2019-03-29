package ArrayListExample;

import java.io.*;
import java.util.*;


public class SerializingArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Hi");
		al.add("Vaibhav");
		al.add("how");
		al.add("are");
		al.add("you");
		
		//Serialization ...
		
		try {
			FileOutputStream fos = new FileOutputStream("myFile");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(al);
			oos.close();
			fos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Deserialization ...
		try {
			
			FileInputStream fis = new FileInputStream("myFile");
			ObjectInputStream ois = new ObjectInputStream(fis);
			al = (ArrayList) ois.readObject();
			ois.close();
			fis.close();
			
		} catch (Exception e) {
		     e.printStackTrace();
		   return;
		}
	
		Iterator<String> i = al.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
