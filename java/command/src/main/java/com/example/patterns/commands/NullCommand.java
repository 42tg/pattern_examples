package com.example.patterns.commands;

public class NullCommand implements PrintCommand{
	public boolean execute(String document)
	{
		System.out.println("NullCall!!");
		return false;
	}
}