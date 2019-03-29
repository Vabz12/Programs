package queueApp;

public class QueueExample {

	String queue[];
	int  max;
	int front ,rear , totalItems;
	
	QueueExample(int size){
		max = size;
		queue = new String[size];
		front= 0;
		rear =0;
	}
	public void insert(String s){
		if(totalItems+1 <= max){
			queue[rear] = s;
			rear++;
			totalItems++;
		}else{
			System.out.println("Queue is Full");
		}
	}
	public void remove()
	{
		if(totalItems > 0){
			queue[front] = "-1";
			front++;
			totalItems--;
		}
		else{
			System.out.println("Empty Queue");
		}
	}
	public void peek(){
		System.out.println(queue[front]);
	}
	public void priorityQueue(String str){
		int i;
		if(totalItems == 0) {
			insert(str);
		}
		else{
			for(i = totalItems-1;i >=0;i--){
				if(Integer.parseInt(str) > Integer.parseInt(queue[i])){
				queue[i+1] = queue[i];
				}else break;
			}
			queue[i+1] = str;
			rear++;
			totalItems++;
		}
		
	}
}
