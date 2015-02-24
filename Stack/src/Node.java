
public class Node 
{
	private int payload;
	private Node nextNode;
	
	public Node(int payload)
	{
		this.payload = payload;
	}

	public int getPayload() 
	{
		return payload;
	}
	
	public Node getNextNode() 
	{
		return this.nextNode;
	}

	public void setNextNode(Node nextNode) 
	{
		this.nextNode = nextNode;
	}
	
	
}
