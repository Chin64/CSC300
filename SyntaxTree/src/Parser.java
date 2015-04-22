
public class Parser 
{
	private String theStmt;
	private int pos; //where am I in the theStmt string
	
	public Parser(String theStmt)
	{
		this.theStmt = theStmt;
		this.pos = 0;
	}
	
	void parse()
	{
		this.eliminateWhiteSpace();
		this.parse_stmt();
	}
	
	private void eliminateWhiteSpace ()
	{
		String temp = theStmt;
		String temp2 = new String();

		for(int i = 0; i < theStmt.length(); i++)
		{
			if(temp.charAt(i) != ' ')
			{
				temp2 = temp2 + temp.charAt(i);
			}
		}
		
		theStmt = temp2;
	}
	
	private void parse_stmt()
	{
		//System.out.println(theStmt);
		String var = new String();
		String mathExpression = new String();
		
		for(int i = 0; i < theStmt.length(); i++)
		{
			if(theStmt.charAt(i) != '=')
			{
				var = var + theStmt.charAt(i);
				pos++;
			}
			else
			{
				break;
			}
		}
		
		for(int i = pos+1; i < theStmt.length(); i++)
		{
			if(theStmt.charAt(i) != ';')
			{
				mathExpression = mathExpression + theStmt.charAt(i);
			}
		}
		
		System.out.println("Read Variable Name: " + var);
		System.out.println("Read Math Expression: " + mathExpression);
		//Print each time it reads something like:
		// Read: VarName = a
		// Reading: Math-Expr
		
		//read a var name
		//read a math_expr
	}
	
	private void parse_math_expr()
	{
		//Display
		//Reading Left:
		//Read OP = *
		//Reading Right
		
		//read left
		//read op
		//read right
	}
}
