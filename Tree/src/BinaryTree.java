
public class BinaryTree 
{
	private Node root;
	private Node temp;
	
	public BinaryTree()
	{
		this.root = null;
	}
	
	public void displayInOrder()
	{
		System.out.println("**** In Order ****");
		if(this.root == null)
		{
			System.out.println("Empty Tree");
		}
		else
		{
			int count = 0;
			System.out.println(root.getPayload());
			
			if(root.getLeftNode() != null)
			{
				temp = root.getLeftNode();
			}
			
			while(temp.getLeftNode() != null)
			{
				temp = temp.getLeftNode();
				count++;
				if(temp.getLeftNode() == null)
				{
					break;
				}
			}
			
			System.out.println(temp.getPayload());
			
			temp = root;
			
			while(count != 0)
			{
				temp = temp.getLeftNode();
				System.out.println(temp.getPayload());
				count--;
			}
			
			if(root.getRightNode().getLeftNode() != null)
			{
				temp = root.getRightNode().getLeftNode();
				System.out.println(temp.getPayload());
			}
			
			if(root.getRightNode().getLeftNode().getRightNode() != null)
			{
				temp = root.getRightNode().getLeftNode().getRightNode();
				System.out.println(temp.getPayload());
			}
			
			temp = root;
			while(temp.getRightNode() != null)
			{
				temp = temp.getRightNode();
				System.out.println(temp.getPayload());
			}
			
		}
	}
	
	public void displayPostOrder()
	{
		System.out.println("**** Post Order ****");
		if(this.root == null)
		{
			System.out.println("Empty Tree");
		}
		else
		{
			int count = 0;
			temp = this.root.getLeftNode();
			
			while(temp.getLeftNode() != null)
			{
				temp = temp.getLeftNode();
				count++;
				if(temp.getLeftNode() == null)
				{
					break;
				}
			}
			System.out.println(temp.getPayload());
			
			temp = root;
			
			while(count != 0)
			{
				if(root.getPayload() <= temp.getPayload())
				{
					System.out.println(root.getPayload());
				}
				temp = temp.getLeftNode();
				System.out.println(temp.getPayload());
				count--;
			}
			
			if(root.getRightNode().getLeftNode() != null)
			{
				temp = root.getRightNode().getLeftNode();
				System.out.println(temp.getPayload());
			}
			
			if(root.getRightNode().getLeftNode().getRightNode() != null)
			{
				temp = root.getRightNode().getLeftNode().getRightNode();
				System.out.println(temp.getPayload());
			}
			
			temp = root;
			while(temp.getRightNode() != null)
			{
				temp = temp.getRightNode();
				System.out.println(temp.getPayload());
			}
		}
		
	}
	
	public void add(int value)
	{
		Node theNode = new Node(value);
		if(this.root == null)
		{
			this.root = theNode;
		}
		else
		{
			this.root.addNode(theNode);
		}
	}
	
}
