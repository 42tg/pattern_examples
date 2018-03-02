package com.example.patterns.strategy.behaviour;

public class RunSlow implements RunBehaviour
{
	public void run()
	{
		System.out.println("Run slow");
	}
}