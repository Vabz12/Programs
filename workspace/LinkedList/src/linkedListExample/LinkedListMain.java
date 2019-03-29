package linkedListExample;

public class LinkedListMain {
	public String name;
	public int age;
	public LinkedListMain next;
	
	public LinkedListMain(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void display(){
		System.out.println(name + " : "+ age + " .");
	}
	
	public String toString()
	{
	return name;
	}

	public static void main(String[] args) {
		
	LinkedList ll = new LinkedList();
	ll.insertFirst("Vaibhav",25);
	ll.insertFirst("Raj", 22);
	ll.insertFirst("Kash", 20);
	ll.insertFirst("Rock", 44);
	ll.insertFirst("Vinay",13);
	ll.display();
	System.out.println("The Name Matches to the Data  :"+ll.find("Vaibhav").name + " is found .");
	System.out.println("The Link removed is : "+ ll.removeLink("Raj"));	
	ll.display();
	System.out.println("Value of First is : "+ll.firstLink);
	ll.removeFirst();
	ll.removeFirst();
	System.out.println(ll.isEmpty());
	System.out.println("The First Removed value is : " +ll.removeFirst());

	ll.display();
	}
}
