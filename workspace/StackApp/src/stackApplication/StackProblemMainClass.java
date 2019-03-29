package stackApplication;

public class StackProblemMainClass {

	public static void main(String args[]){		
		Stack s = new Stack(5);

		s.push("A");
		System.out.println(s.peek());
		s.push("B");
		System.out.println(s.peek());
		s.push("C");
		System.out.println(s.peek());
		s.push("D");
		System.out.println(s.peek());
		s.push("E");
		System.out.println(s.peek());
		System.out.println("First elment removed is  : " +s.pop());
		s.popAll();
		System.out.println(s.peek());
	}
}
