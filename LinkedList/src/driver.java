
public class driver {

	public static void main(String[] args) throws Exception 
	{
		LinkedList ll = new LinkedList();
		ll.addFront(9);
		ll.addEnd(3);
		ll.addEnd(7);
		ll.addEnd(4);
		ll.addFront(6);
		ll.display();
		ll.addAtIndex(8, 0);
		ll.display();
		ll.removeFront();
		ll.display();
		ll.removeEnd();
		ll.display();
		//https://github.com/Chin64/CSC300
	}

}
