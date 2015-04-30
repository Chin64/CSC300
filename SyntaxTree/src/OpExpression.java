
public class OpExpression extends Expression
{
	
private String theOp;
	
	public OpExpression(String theOp)
	{
		this.theOp = theOp;
	}

	public String getTheOp() {
		return theOp;
	}

	public void setTheOp(String theOp) {
		this.theOp = theOp;
	}	
	
}
