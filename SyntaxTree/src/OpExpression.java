
public class OpExpression extends Expression
{
	
private char theOp;
	
	public OpExpression(char theOp)
	{
		this.theOp = theOp;
	}

	public char getTheOp() {
		return theOp;
	}

	public void setTheOp(char theOp) {
		this.theOp = theOp;
	}
	
}
