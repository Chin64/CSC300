
public class Node 
{
	private Node nextNode;
	private int payload;
	private Node previousNode;
	
	public Node(int payload)
	{
		this.payload = payload;
		this.nextNode = null;
	}

	public Node getNextNode() 
	{
		return this.nextNode;
	}

	public void setNextNode(Node nextNode) 
	{
		this.nextNode = nextNode;
	}

	public int getPayload() 
	{
		return payload;
	}

	public Node getPreviousNode() 
	{
		return this.previousNode;
	}

	public void setPreviousNode(Node previousNode) 
	{
		this.previousNode = previousNode;
	}

}
