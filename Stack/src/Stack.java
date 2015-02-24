
public class Stack 
{
	private Node head;
	private int count;
	
	public void display()
	{
		if(head == null)
		{
			System.out.println("Empty List");
		}
		else
		{
			Node currNode = this.head;
			while(currNode.getNextNode() != null)
			{
				System.out.print(currNode.getPayload() + "->");
				currNode = currNode.getNextNode();
			}
			System.out.println(currNode.getPayload() + "-> null");
		}
	}
	
	public void push(int payload)
	{
		//Initialize variable
		Node n = new Node(payload);
		
		//Adding to the front, if there's no head
		if(head == null)
		{
			head = n;
			this.count++;
		}
		
		//if there is a head
		else
		{
			//insert desired head value
			n.setNextNode(head);
			head = n;
			
			this.count++;
		}
	}
	
	public int pop() throws Exception
	{
		//if there's an empty list
		if(head == null)
		{
			throw new Exception("Can Not Remove Front: Empty List");
		}
		
		//initialize variable
		Node currNode = head;
		
		//reroute the pointers, forget first node
		head = head.getNextNode();
		currNode.setNextNode(null);
		
		//edit count
		this.count--;
		
		//return bad node
		return currNode.getPayload();
	}
	
	public void peek()
	{
		//set the head of the stack
		Node n = head;
		
		//display the head of the stack
		System.out.println(n.getPayload());
		
	}

}
