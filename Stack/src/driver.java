
public class driver 
{
	public static void main (String[] args) throws Exception
	{
		//initialize new stack
		Stack s = new Stack();

		//add to the stack
		s.push(9);
		s.push(8);
		s.push(7);
		s.push(6);
		s.push(5);
		s.push(4);
		s.push(3);

		//display the stack
		s.display();
		s.peek();

		//remove from the stack
		s.pop();
		s.pop();
		s.pop();

		//display the stack
		s.display();
		s.peek();
	}
}
