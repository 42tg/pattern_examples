package com.example.patterns.strategy;

import com.example.patterns.strategy.behaviour.*;
public class Chiwawa extends Dog
{
	public Chiwawa()
	{
		System.out.println("A Chiwawa is born");
		this.setBarkBehaviour(new BarkQuiet());
		this.setRunBehaviour(new RunSlow());
	}
}
