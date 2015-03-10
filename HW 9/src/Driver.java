import java.util.Random;

public class Driver 
{
	public static void main (String[] args) throws Exception
	{
		int peopleToDequeue = 25;
		
		Random r = new Random();
		
		Stack s = new Stack();
		
		for(int i = 0; i <= 100; i++)
		{
			int value = r.nextInt(50);
			s.Enqueue(value);
		}
		s.display();
		
		for(int i = 1; i <= peopleToDequeue; i++)
		{
			s.dequeue();
		}
		
		s.display();
		
		//https://github.com/Chin64/CSC300
	}
}
