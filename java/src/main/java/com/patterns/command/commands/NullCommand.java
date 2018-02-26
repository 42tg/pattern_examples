package com.patterns.command.commands;

public class NullCommand implements PrintCommand{
	public boolean execute(String document)
	{
		System.out.println("NullCall!!");
		return false;
	}
}