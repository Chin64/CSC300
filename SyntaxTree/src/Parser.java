
public class Parser
{
	private String theStmt;
	private int pos; //where am I in the theStmt string
	private static final String legalVariableCharacters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ "; 
	private static final String legalOpCharacters = "+-*/% ";

	public Parser(String theStmt)
	{
		this.theStmt = theStmt;

		this.pos = 0;
	}

	void parse()
	{
		this.parse_stmt();
	}

	private String getNextToken(char c)
	{
		while(pos < this.theStmt.length())
		{
			if(this.theStmt.charAt(pos) == c)
			{
				pos++;
				break;
			}
			pos++;
		}
		return "" + c;
	}

	private String getNextToken(String legalChars)
	{
		String token = "";
		while(pos < this.theStmt.length())
		{
			if(legalChars.indexOf(this.theStmt.charAt(pos)) != -1)
			{
				token += this.theStmt.charAt(pos);
			}
			else
			{
				//this means we are at the end of the token
				//We are always trimming leading and trailing spaces
				//move forward one
				break;
			}
			pos++;
		}
		return token.trim();
	}

	private VarDefStatement parse_stmt()
	{
		VarDefStatement Solution = null;
		VarExpression theVar = null;
		//Print each time it reads something like:
		// Read: VarName = a
		String varName = this.getNextToken(Parser.legalVariableCharacters);
		if(!varName.isEmpty())
		{
			theVar.setVarName(varName);
			Solution.setTheVarExpr(theVar);
		}
		
		System.out.println("Read VarName: " + varName);

		//burn past the =
		this.getNextToken('=');
		System.out.println("Burned =");

		// Reading: Math-Expr
		this.parse_math_expr();

		//burn past the ;
		this.getNextToken(';');
		System.out.println("Burned ;");
		
		return Solution = null;
	}

	private MathExpression parse_math_expr()
	{
		MathExpression solution = null;
		OpExpression theOp = null;
		
		
		String varName = this.getNextToken(Parser.legalVariableCharacters);
		if(varName.length() == 0)
		{
			//we know that we are at the beginning of a paren-math-expr
			this.getNextToken('(');
			System.out.println("Burned (");
			this.parse_math_expr();
			solution.setLeftOperand(this.parse_math_expr());
			solution.setRightOperand(this.parse_math_expr());
			this.getNextToken(')');
			System.out.println("Burned )");
		}
		else
		{
			System.out.println("Read VarName: " + varName);
		}
		String op = this.getNextToken(Parser.legalOpCharacters);
		op.trim();
		for(int i = 0; i < op.length(); i++)
		{
			if(op.length() == 1)
			{
				theOp.setTheOp(op.charAt(i));
			}
			else
			{
				if(op.length() > 1)
				{
					op.trim();
					theOp.setTheOp(op.charAt(0));
				}
			}
		}
		
		System.out.println("Read Op: " + op);
		varName = this.getNextToken(Parser.legalVariableCharacters);
		if(varName.length() == 0)
		{
			//we know that we are at the beginning of a paren-math-expr
			this.getNextToken('(');
			this.parse_math_expr();
			this.getNextToken(')');
		}
		else
		{
			System.out.println("Read VarName: " + varName);
		}
		
		return solution = null;
	}
	
}
