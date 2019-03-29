package stackApplication;

public class Stack {

	String a[];
	int top;
	int max;

	public Stack(int n){
		max = n;
		a = new String[max];
		top = 0;
	}
	public void push(String s){		
		if(top<max){
		a[top] = s;
		top++;
		}else{
			System.out.println("Overflow.");
		}
	}
	public String pop(){
		if(!this.empty()){
			String t = this.peek();
			a[top-1] = null;
			top--;
			return t;
		}else{
			return null;
		}
	}
	public String peek(){
		if(top>0){
			return a[top-1];
		}else{
			return null;
		}
	}
	public boolean empty(){
		if(top == 0){
			return true;
		}else{
			return false;
		}
	}
	public String popAll(){
		
		for(int i = top; i>0;i--){
			pop();
			System.out.println(i);
		}
		return null;
	}
}
