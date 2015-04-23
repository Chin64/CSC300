
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
		System.out.println("Starting Formula: " + theStmt);
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
			else
			{
				break;
			}
		}
		
		System.out.println("Read Variable Name: " + var);
		System.out.println("Read Math Expression: " + mathExpression + "\n");
		
		this.parse_math_expr();
		//Print each time it reads something like:
		// Read: VarName = a
		// Reading: Math-Expr
		
		//read a var name
		//read a math_expr
	}
	
	private void parse_math_expr()
	{
		String mathExpression = new String();
		String temp = new String();
		String left = new String();
		String operator = new String();
		String right = new String();
		
		for(int i = pos+1; i < theStmt.length(); i++)
		{
			if(theStmt.charAt(i) != ';')
			{
				mathExpression = mathExpression + theStmt.charAt(i);
			}
			else
			{
				break;
			}
		}
		
		System.out.println("Reading Math Expression: " + mathExpression);
		
		for(int i = pos+1; i < theStmt.length(); i++)
		{

			if(theStmt.charAt(i) == '(')
			{
				left = left + theStmt.charAt(i);
				pos = i;
			}
			else if(theStmt.charAt(i) != ')')
			{
				left = left + theStmt.charAt(i);
				pos = i;
			}
			else if (theStmt.charAt(i) == ')')
			{
				left = left + theStmt.charAt(i);
				pos = i;
				break;
			}

			else if(theStmt.charAt(i) != '(')
			{
				if(theStmt.charAt(i) != '+' || theStmt.charAt(i) != '-' || theStmt.charAt(i) != '*' || theStmt.charAt(i) != '/' || theStmt.charAt(i) != '%')
				{
					left = left + theStmt.charAt(i);
					pos++;
					break;
				}
			}

		}

		for(int i = pos; i < theStmt.length();i++)
		{
			
			if(theStmt.charAt(i) == '+' || theStmt.charAt(i) == '-' || theStmt.charAt(i) == '*' || theStmt.charAt(i) == '/' || theStmt.charAt(i) == '%')
			{
				operator = operator + theStmt.charAt(i);
				pos = i;
				break;
			}
		}
		
		for(int i = pos+1; i < theStmt.length(); i++)
		{
			right = right + theStmt.charAt(i);
			pos++;
		}
		
		
		for(int i = 2; i < theStmt.length(); i++)
		{
			if(theStmt.charAt(i) == '(' || theStmt.charAt(i) == ')')
			{
				break;
			}
			else
			{
				left = "";
				
				if(theStmt.charAt(i) != '+' || theStmt.charAt(i) != '-' || theStmt.charAt(i) != '*' || theStmt.charAt(i) != '/' || theStmt.charAt(i) != '%')
				{
					left = left + theStmt.charAt(i);
					pos = i;
					break;
				}
			}
		}
		for(int i = 2; i < theStmt.length(); i++)
		{
			if(theStmt.charAt(i) == '(' || theStmt.charAt(i) == ')')
			{
				break;
			}
			else if(theStmt.charAt(i) == '+' || theStmt.charAt(i) == '-' || theStmt.charAt(i) == '*' || theStmt.charAt(i) == '/' || theStmt.charAt(i) == '%')
			{
				operator = operator + theStmt.charAt(i);
				pos = i;
				break;
			}
		}
		for(int i = pos+1; i < theStmt.length();)
		{
			if(theStmt.charAt(i) == '(' || theStmt.charAt(i) == ')')
			{
				break;
			}
			else 
			{
				right = right + theStmt.charAt(i);
				pos = i;
				break;
			}
		}
		
		if(left.length() > 0)
		{
			System.out.println("Reading Left: " + left);
		}
		if(operator.length() > 0)
		{
			System.out.println("Reading Operator: " + operator);
		}
		if(right.length() > 0)
		{
			System.out.println("Reading Right: " + right);
		}		
		//Display
		//Reading Left:
		//Read OP = *
		//Reading Right
		
		//read left
		//read op
		//read right
	}
}
