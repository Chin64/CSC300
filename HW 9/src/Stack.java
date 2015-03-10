
public class Stack 
{
	private Node head;
	private int count;
	private Node tail;
	
	public Stack()
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
		int personNum = 0;
		System.out.println("*****************");
		if(head == null)
		{
			System.out.println("Empty List");
		}
		else
		{
			Node currNode = this.head;
			while(currNode.getNextNode() != null)
			{
				System.out.println("This is person number "+ personNum +" and they have $" + currNode.getPayload()+" in their wallet.");
				currNode = currNode.getNextNode(); 
				personNum++;
			}
		}
		System.out.println("*****************");
	}

	public void Enqueue(int payload)
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

	public int dequeue() throws Exception
	{
		if(head == null)
		{
			throw new Exception("Can Not Remove Front: Empty List");
		}
		Node currNode = head;
		head = head.getNextNode();
		currNode.setNextNode(null);
		this.count--;
		return currNode.getPayload();
	}

}
