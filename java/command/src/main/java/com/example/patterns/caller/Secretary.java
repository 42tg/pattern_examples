package com.example.patterns.caller;

import com.example.patterns.commands.PrintCommand;
import com.example.patterns.commands.NullCommand;
public class Secretary
{
	private PrintCommand printer = new NullCommand();

	public void setPrinter(PrintCommand anyCommand){
		this.printer = anyCommand;
	}

	public boolean executePrint(String document)
	{
		System.out.println("Secretary prints");
		return this.printer.execute(document);
	}
}
