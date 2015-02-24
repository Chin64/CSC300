
public class driver {

	public static void main(String[] args) throws Exception 
	{
		LinkedList ll = new LinkedList();
		ll.addFront(9);
		ll.addFront(7);
		ll.addFront(4);
		ll.addFront(3);
		ll.addFront(6);
		ll.addEnd(5);
		ll.display();
		ll.addAtIndex(8, 0);
		ll.display();
		ll.removeFront();
		ll.display();
		ll.removeEnd();
		ll.display();
		ll.removeAtIndex(4);
		ll.display();
		ll.displayBackwards();
		//https://github.com/Chin64/CSC300
	}

}
