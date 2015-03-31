
public class BinaryTree 
{
	//private Node root;
	private boolean isEmpty;
	private int payload;
	private BinaryTree leftTree;
	private BinaryTree rightTree;
	
	public BinaryTree()
	{
		this.isEmpty = true;
		this.leftTree = null;
		this.rightTree = null;
	}
	
	public boolean search(int value)
	{
		
		if(this.payload == value)
		{
			System.out.println(value + " found in the tree");
			return true;
		}
		else if(value < this.payload)
		{
			if(this.leftTree != null)
			{
				if(this.leftTree.payload == value)
				{
					System.out.println(value + " found in the tree");
					return true;
				}
				else
				{
					this.leftTree.search(value);
					return true;
				}
			}
		}
		else if(value > this.payload)
		{
			if(this.rightTree != null)
			{
				if(this.rightTree.payload == value)
				{
					System.out.println(value + " found in the tree");
					return true;
				}
				else
				{
					this.rightTree.search(value);
					return true;
				}
			}
		}
		
		System.out.println("The value was not found.");
		return false;
	}
	
	private void visitInOrder()

	{
		if(this.leftTree != null)
		{
			this.leftTree.visitInOrder();
		}
		System.out.println(this.payload);
		if(this.rightTree != null)
		{
			this.rightTree.visitInOrder();
		}
	}
	
	public void displayInOrder()
	{
		System.out.println("**** In Order ****");
		if(this.isEmpty)
		{
			System.out.println("Empty Tree");
		}
		else
		{
			this.visitInOrder();
		}
	}
	
	private void visitPreOrder()
	{
		System.out.println(this.payload);
		if(this.leftTree != null)
		{
			this.leftTree.visitPreOrder();
		}
		if(this.rightTree != null)
		{
			this.rightTree.visitPreOrder();
		}
	}
	
	public void displayPreOrder()
	{
		System.out.println("**** Pre Order ****");
		if(this.isEmpty)
		{
			System.out.println("Empty Tree");
		}
		else
		{
			this.visitPreOrder();
		}
	}
	
	private void visitPostOrder()
	{
		if(this.leftTree != null)
		{
			this.leftTree.visitPostOrder();
		}
		if(this.rightTree != null)
		{
			this.rightTree.visitPostOrder();
		}
		System.out.println(this.payload);
	}
	
	public void displayPostOrder()
	{
		System.out.println("**** Post Order ****");
		if(this.isEmpty)
		{
			System.out.println("Empty Tree");
		}
		else
		{
			this.visitPostOrder();
		}
	}
	
	public void add(int value)
	{
		if(this.isEmpty)
		{
			this.payload = value;
			this.isEmpty = false;
		}
		else
		{
			if(value <= this.payload)
			{
				if(this.leftTree == null)
				{
					this.leftTree = new BinaryTree();
				}
				this.leftTree.add(value);
				this.isEmpty = false;
			}
			else
			{
				if(this.rightTree == null)
				{
					this.rightTree = new BinaryTree();
				}
				this.rightTree.add(value);
				this.isEmpty = false;
			}
		}
	}
	
}
