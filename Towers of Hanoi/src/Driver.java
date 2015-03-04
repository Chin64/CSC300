
public class Driver {

	public static void main(String[] args) 
	{
		Start begin = new Start();
		//begin.on();
		
		Tower tower1 = new Tower();
		tower1.addDisc(new Disc(2));
		tower1.addDisc(new Disc(1));
		tower1.addDisc(new Disc(0));
		tower1.display();
		tower1.peek();
		tower1.display();
	}

}
