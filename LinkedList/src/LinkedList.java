
public class LinkedList 
{
	private Node head;
	private int count;
	private Node tail;
	
	public LinkedList()
	{
		this.head = null;
		this.count = 0;
		this.tail = null;
	}
 
	public int get(int index)
	{
		int count = this.count();
		
		if(index >= count || index < 0)
		{
			System.out.println("Illegal Index");
			return -1;
		}
		else
		{
			Node curr = head;
			for(int i = 0; i < index; i++)
			{
				curr = curr.getNextNode();
			}
		
			return curr.getPayload();
		}
	}

	public int count()
	{
		return this.count;
	}

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
			//System.out.println(tail.getPayload());
		}
	}

	public void displayBackwards()
	{
		LinkedList temp = new LinkedList();
		for(int i = 0; i < this.count; i++)
		{
			temp.addFront(this.get(i));
		}
		temp.display();
	}
	
	public Node getTail()
	{
		//initialize variable
		Node temp = head;
		
		//search linked list for end
		for (int i = 0; i < count - 1; i++)
		{
			//set temp equal to the next node in the list until the end
			temp = temp.getNextNode();
			
			//set the tail variable
			tail = temp;
		}
		//return tail
		return tail;
	}

	public void addAtIndex(int payload, int index)
	{
		//initialize variables
		Node temp = new Node (payload);
		Node n = head;
		
		//if there's no head, make one
		if(index <= 0)
		{
			this.addFront(payload);
		}
		//if there is a head
		else
		{
			//search list for given index
			for (int i = 1; i < index && n.getNextNode() != null; i++) 
			{
	            n = n.getNextNode();  
	        }
			
			//don't forget the rest of the list!
	        temp.setNextNode(n.getNextNode());
	        n.setNextNode(temp);
	        this.count++;
	    }
	}

	public void addFront(int payload)
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
			//set the pointers, insert desired head value
			n.setNextNode(head);
			head = n;
			n.setPreviousNode(n);
			this.count++;
		}
		
		if(tail == null)
		{
			tail = n;
		}
		
	}

	public void addEnd(int payload)
	{
		Node n = new Node(payload);
		if(this.head == null)
		{
			this.head = n;
		}
		else
		{
			//find the last node in the list
			Node currNode = this.head;
			while(currNode.getNextNode() != null)
			{
				currNode = currNode.getNextNode();
				tail = currNode;

			}
			
			//currNode will point to the very last Node in the list
			currNode.setNextNode(n);
		}
		this.count++;
	}
	
	public int removeEnd() throws Exception
	{
		//if there's an empty list
		if(head == null)
		{
			throw new Exception("Can Not Remove End: Empty List");
		}
		//if there's only one number in the list
		else if(this.count == 1)
		{
			return this.removeFront();
		}
		//removing the last node
		else
		{
			//initialize variables
			Node currNode = tail;
			
			// reroute the pointer, leave last node for garbage man
			currNode.setNextNode(null);
			
			//edit count
			this.count--;
			
			//return the bad node
			return currNode.getPayload();
		}
	}

	public int removeFront() throws Exception
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
	
	public int removeAtIndex(int index) throws Exception
	{
		//if there's an empty list
		if(head == null)
		{
			throw new Exception("Can Not Remove End: Empty List");
		}
		//if there's only one number in the list
		else if(this.count == 1 || index == 0)
		{
			return this.removeFront();
		}
		//remove at given index
		else
		{
			//initialize variables
			Node currNode = head;

			//traverse list
			for(int i = 0; i < index - 2; i++)
			{
				currNode = currNode.getNextNode();
			}

			//skip over the node needing to be deleted
			currNode.setNextNode(currNode.getNextNode().getNextNode());

			//edit count
			this.count--;

			//return dead node
			return currNode.getPayload();
		}
	}
	
	
}
