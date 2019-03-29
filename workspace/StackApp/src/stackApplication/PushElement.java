package stackApplication;

public class PushElement {

	public static void main(String[] args) {
		St  s = new St(15);
		s.push("A");
		s.push("B");
		s.push("C");
		s.push("D");	
		s.pushMany("W E R T Y U I O P");
	}
}

class St{
	int max;
	int top;
	String a[];
	
	public St(int n){
	max = n;
	a = new String[max];
	top=0;
	}
	
	public void push(String s){
		if(top<max){
			a[top] = s;
			top++;
			displayStack();
		}else{
			System.out.println("Overflow");
			displayStack();
		}
	}
	public void pushMany(String multiple){
		String[] temp = multiple.split(" ");
		for(int i = 0; i<temp.length ; i++){
			push(temp[i]);
		}
	}
	
	public void displayStack(){
		for(int n =0;n<max;n++){
			System.out.printf("|%2s" + " ",a[n]);
		}
		System.out.println("|");
		System.out.println();
	}
}