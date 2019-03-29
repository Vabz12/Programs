package queueApp;

public class QueueMain {

	public static void main(String[] args) {
		QueueExample qE = new QueueExample(4);
//		qE.insert("A");
//		qE.insert("C");
	    qE.priorityQueue("10");
	    qE.priorityQueue("19");
	    qE.priorityQueue("11");
		System.out.println(qE.totalItems);
	    qE.peek();
	}
}
