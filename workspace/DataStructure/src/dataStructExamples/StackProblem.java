package dataStructExamples;

public class StackProblem {

	public static void main(String[] args) {
	//Push , Pop ,Peek , isEmpty
		Stack1 s1 = new Stack1(5);
		s1.push("A");
		System.out.print(s1.peek());
		s1.push("B");
		System.out.print(s1.peek());
		s1.push("C");
		System.out.print(s1.peek());
		s1.push("D");
		System.out.print(s1.peek());
		s1.push("E");
		System.out.print(s1.peek());
		
		s1.popAll();
		System.out.println(s1.peek());
	}
}
class Stack1{
	//Variables defined ...
	int max; //maximum size of array/stack ...
	int top = 0; // top of the stack ...
	String a[]; // Array defined ...

	//Contructor ...
	public Stack1(int n){ // the constructor in which the maximum size of the stack is defined ...
		max = n; // maximum size assigned to variable n ...
		a = new String[max]; //size of Stack passed to array ... by using new keyword.
		top=0; // top initialized as 0.
	}
	
	//Push Method.
	public void push(String s){
		
		// check wether the top is less than the maximum element
		if(top<max){    /* If top is less than the maximum size of stack than push the element in array */
			a[top] = s; // Array element is pushed in to stack.
			top++;// Increment the value of top till the max size of array ...
		displayStack();
		}	
		else{
			System.out.print("!! OVERFLOW !!");
		}
	}
	
	// Checks whether array is empty or not ....
	boolean isEmpty(){
		//By default if top is 0 than return true or else false ...
		if(top == 0){
			return true;
		}else{
			return false;
		}
	}
	
	// Pop method...
	public String pop(){
		// If the stack is not empty than the top value in stack is assigned to peek...
		if(!this.isEmpty()){
			String t = this.peek(); // top value is assigned to peek ...
			a[top-1] = null; // If the value is popped than top value will be set to null ...
			top--; //decrement till the whole stack is checked and than return top value.
			
			return t;
		}
		else{
			System.out.println("!! UNDERFLOW !!");
			return null;
		}
	}
	
	// Peek method will check the top of the stack ... 
	public String peek(){
		//if Top Value is greater than 0 
		if(top>0){
			return a[top-1];
		}else{
			return null;
		}
	}
	// this method will pop all elements at same time ...
	public String popAll(){
		
		for(int i=top ; i>0;i--){
			pop();
			System.out.println(i);
		}
		return null;
	}
	public void displayStack(){
		for(int n = 0;n<max; n++){
			System.out.printf("| %2s "+" ",a[n]);
		}
		System.out.println("|");
		System.out.println();
	}
}