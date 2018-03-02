package com.example.patterns.strategy.behaviour;

public class BarkQuiet implements BarkBehaviour
{
	public void bark()
	{
		System.out.println("Bark quiet!!");
	}
}