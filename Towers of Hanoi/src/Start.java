import java.util.Scanner;

public class Start 
{
	private Tower tower1;
	private Tower tower2;
	private Tower tower3;
	
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
			}
			
		}
	}
}
