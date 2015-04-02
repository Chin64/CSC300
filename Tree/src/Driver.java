import java.util.Random;

public class Driver 
{

	public static void main(String[] args) 
	{
		Random r = new Random();
		BinaryTree bt = new BinaryTree();
		int test = 0;
		while(test != 10)
		{
			for(int i = 0; i < 5000; i++)
			{
				bt.add(r.nextInt());
			}
			System.out.println(bt.isBalanced());
			test++;
		}
	}

}
