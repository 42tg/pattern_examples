package com.example.patterns.interpreter;

public class AndExpression implements Expression
{
	private Expression data1;
	private Expression data2;

	public AndExpression(Expression data1, Expression data2)
	{
		this.data1 = data1;
		this.data2 = data2;
	}

	@Override
	public boolean interpret(String context)
	{
		return data1.interpret(context) && data2.interpret(context);
	}
}
