
public class MathExpression extends Expression
{
	private Expression leftOperand;
	private Expression rightOperand;
	private OpExpression operator;
	
	public MathExpression(Expression leftOperand, Expression rightOperand, OpExpression operator)
	{
		this.leftOperand = leftOperand;
		this.rightOperand = rightOperand;
		this.operator = operator;
	}
	
	public String toString()
	{
		if(leftOperand != null)
		{
			return "(" + leftOperand.toString() + ")" + operator.toString() + rightOperand.toString();
		}
		if(rightOperand != null)
		{
			return leftOperand.toString() + operator.toString() + rightOperand.toString() ;
		}
		return leftOperand.toString() + operator.toString()+ rightOperand.toString();
	}
}
