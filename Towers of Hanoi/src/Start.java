import java.util.Scanner;

public class Start 
{
	private Tower tower1;
	private Tower tower2;
	private Tower tower3;
	private Disc discToMove;
	
	public Start()
	{
		this.tower1 = new Tower();
		this.tower2 = new Tower();
		this.tower3 = new Tower();
	}
	
	public void on()
	{
		tower1.addDisc(new Disc(2));
		tower1.addDisc(new Disc(1));
		tower1.addDisc(new Disc(0));
		
		Scanner input = new Scanner(System.in);
		
		while (true)
		{
			System.out.print("=> ");
			String val = input.nextLine().trim();
			if(val.equalsIgnoreCase("quit") || val.equalsIgnoreCase("exit"))
			{
				break;
			}
			else if(val.equalsIgnoreCase("show"))
			{
				System.out.println("****");
				tower1.display();
				System.out.println("****");
				tower2.display();
				System.out.println("****");
				tower3.display();
				System.out.println("****");
			}
			else if(val.equalsIgnoreCase("move"))
			{
				System.out.println("Enter Tower Number to start from to: => ");
				Scanner input2 = new Scanner(System.in);
				String startTower = input2.nextLine().trim();
				
				System.out.println("Enter Tower Number to move to: => ");
				Scanner input3 = new Scanner(System.in);
				String endTower = input3.nextLine().trim();
				
				if(startTower.equalsIgnoreCase("tower1") && endTower.equalsIgnoreCase("tower2"))
				{
					discToMove = tower1.peek();
					tower1.removeDisc();
					tower2.addDisc(discToMove);
				}
				else if(startTower.equalsIgnoreCase("tower1") && endTower.equalsIgnoreCase("tower3"));
				{
					discToMove = tower1.peek();
					tower1.removeDisc();
					tower3.addDisc(discToMove);
				}
				else if(startTower.equalsIgnoreCase("tower2") && endTower.equalsIgnoreCase("tower3"));
				{
					discToMove = tower2.peek();
					tower2.removeDisc();
					tower3.addDisc(discToMove);
				}
				else if(startTower.equalsIgnoreCase("tower3") && endTower.equalsIgnoreCase("tower2"));
				{
					discToMove = tower3.peek();
					tower3.removeDisc();
					tower2.addDisc(discToMove);
				}
				else if(startTower.equalsIgnoreCase("tower3") && endTower.equalsIgnoreCase("tower1"));
				{
					discToMove = tower3.peek();
					tower3.removeDisc();
					tower1.addDisc(discToMove);
				}
			}
		}
	}
}
