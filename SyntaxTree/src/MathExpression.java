
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

	public OpExpression getOperator() {
		return operator;
	}

	public void setOperator(OpExpression operator) {
		this.operator = operator;
	}
	
	
	
}
