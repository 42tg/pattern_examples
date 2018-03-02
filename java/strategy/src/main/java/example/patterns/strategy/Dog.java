package com.example.patterns.strategy;

import com.example.patterns.strategy.behaviour.*;
public abstract class Dog
{
	BarkBehaviour barkBehaviour = new BarkLoud();
	RunBehaviour runBehaviour = new RunFast();

	public void setBarkBehaviour(BarkBehaviour bark)
	{
		this.barkBehaviour = bark;
	}

	public void setRunBehaviour(RunBehaviour run)
	{
		this.runBehaviour = run;
	}

	public void bark()
	{
		barkBehaviour.bark();
	}

	public void run()
	{
		runBehaviour.run();
	}
}
