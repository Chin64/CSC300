
public class LinkedList 
{
	private Node head;
	private int count;
	public LinkedList()

	{
		this.head = null;
		this.count = 0;
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
		}
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
	    }
		this.count++;
		
	}

	public void addFront(int payload)
	{
		Node n = new Node(payload);
		if(head == null)
		{
			head = n;
		}
		else
		{
			n.setNextNode(head);
			head = n;
		}
		this.count++;
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
			}
			//currNode will point to the very last Node in the list
			currNode.setNextNode(n);
		}
		this.count++;
	}
}
