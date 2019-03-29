package linkedListExample;

public class LinkedList {

	// Reference to first link in list and the last link which is added t the
	// linked list.
	public LinkedListMain firstLink;
	public LinkedListMain lastLink;

	LinkedList() {
		// First link always start as null.
		firstLink = null;
	}

	public boolean isEmpty() {
		// Returns true if link list is empty.
		return (firstLink == null);
	}

	public void insertFirst(String name, int age) {
		LinkedListMain newLink = new LinkedListMain(name, age);
		// Connects the firstlink with the new Link which is goin to be added.

		newLink.next = firstLink;
		firstLink = newLink;
	}

	public LinkedListMain removeFirst() {

		LinkedListMain ref = firstLink;
		if (!isEmpty()) {
			// Removes link from list .
			firstLink = firstLink.next;
			System.out.println("Removed Elements is : " + firstLink);
		} else {
			System.out.println("Empty ");
		}
		return ref;
	}

	public LinkedListMain find(String name) {
		LinkedListMain theLink = firstLink;
		if (!isEmpty()) {
			while (theLink.name != name) {
				if (theLink.next == null) {
					return null;
				} else {
					theLink = theLink.next;
				}
			}
		} else {
			System.out.println("EMPTY");
		}
		return theLink;
	}
	
	public int length(LinkedListMain firstLink){
		if(firstLink == null){
			return 0;
		}
		int cnt = 0;
		LinkedListMain curent = firstLink;
		while(curent != null){
			cnt++;
			curent = curent.next;
		}
		return cnt;
	}
//	public LinkedListMain insertAtPosition(LinkedListMain h,String name,int age,int position){
//		int size;
//		size = length(h);
//		if(position > size+1 || position <1){
//			System.out.println("Invalid Position");
//			return h;
//		}
//		LinkedListMain newNode = new LinkedListMain(name, age);
//		if(position == 1 ){
//			newNode.next = h;
//			return newNode;
//		}
//		else{
//			LinkedListMain previous = h;
//			int count =1;
//			while(count <position-1){
//				previous = previous.next;
//				count++;
//			}
//			LinkedListMain curent = previous.next;
//			newNode.next = curent;
//			previous.next = newNode;
//			return h;
//		}
//		
//	}

	public LinkedListMain removeLink(String name) {
		LinkedListMain currentLink = firstLink;
		LinkedListMain previousLink = firstLink;

		while (currentLink.name != name) {
			if (currentLink.next == null) {
				return null;
			} else {
				previousLink = currentLink;
				currentLink = currentLink.next;

			}
		}
		if (currentLink == firstLink) {
			firstLink = firstLink.next;
		} else {
			System.out.println(
					"Found Match => " + "Current Link is : " + currentLink + " & " + " First Link is : " + firstLink);
			previousLink.next = currentLink.next;
		}
		return currentLink;
	}

	
	public void display() {		
		LinkedListMain theLink = firstLink;
		while (theLink != null) {
			theLink.display();
			System.out.println("Next Link: " + theLink.next);
			theLink = theLink.next;
			System.out.println();
		}
	}

}
