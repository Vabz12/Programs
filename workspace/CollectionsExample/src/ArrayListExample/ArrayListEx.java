package ArrayListExample;

import java.util.*;
public class ArrayListEx {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		//Adding elements in the list ...
		al.add("Hi");
		al.add("How");
		al.add("Are");
		al.add("You ?");
		
		ArrayList<String> al1 = new ArrayList<String>();
		
		al1.add("Vaibhav");
		al1.add("Raj");
		al1.add("Vicky");
		al1.add("Rocky");
		
		ArrayList<String> a = new ArrayList<String>();
		
		//Joining two lists ...
		a.addAll(al);
		a.addAll(al1);
		
		for(String tmp : a){
			System.out.println(tmp);
		}
		
		Object[] arr = al.toArray();
		
		for(Object o : arr){
			System.out.print(" "+o);
		}
		System.out.println();
		//Displaying all elements of the Index ...
		System.out.println("The elements in Arraylist are : "+ al);

		//Add element by index in the list ...
		al.add(1,"Vaibhav");
		System.out.println("The elements in Arraylist after adding the element : "+ al);
		
		//Remove element by index in the list ...
		al.remove(1);
		System.out.println("The elements in Arraylist after removing element : "+ al);
		
		//Remove element by passing the string ...
		al.remove("Hi");
		System.out.println("The elements in Arraylist after removing element : "+ al);
		
		//Displaying all elements of the Index ...
		System.out.println("The elements in Arraylist are : "+ al);
		
		//Updating the value of element ...
		al.set(2, "U");
		System.out.println("After updating value : "+ al);
		
		//Finding position of Element in list ...
		int pos = al.indexOf("Are");
		System.out.println("The index of element "+al.get(1)+" is " + pos);
		
		//Size of list ...
		int numOfItemsInList = al.size();
		System.out.println("The Size of list is : "+numOfItemsInList);
		
		//Check whether the element is in the list or not ...
		System.out.println(al.contains("Vaibhav"));
		
		//Clear all elements of the list 
		al.clear();
		System.out.println("..." +al);
	}
}