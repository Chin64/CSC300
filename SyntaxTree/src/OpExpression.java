
public class OpExpression extends Expression
{
	
private char theOp;
	
	public OpExpression(char theOp)
	{
		this.theOp = theOp;
	}
	
	public String toString()
	{
		return "" + theOp;
	}
}
