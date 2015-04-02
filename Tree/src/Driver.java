
public class Driver 
{

	public static void main(String[] args) 
	{
		BinaryTree bt = new BinaryTree();
		bt.add(2);
		bt.add(5);
		bt.add(3);
		bt.add(7);
		bt.add(1);
		bt.add(0);
		bt.add(4);
		bt.add(15);
		bt.add(9);
		bt.add(-4);
		bt.add(1630);
		bt.displayInOrder();
		
		System.out.println(bt.search(1630));
		
		System.out.println(bt.isBalanced());
	}

}
