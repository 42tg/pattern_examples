package com.patterns.command.caller;

import com.patterns.command.commands.PrintCommand;
import com.patterns.command.commands.NullCommand;
public class Secretary
{
	private PrintCommand printer = new NullCommand();

	public void setPrinter(PrintCommand anyCommand){
		this.printer = anyCommand;
	}

	public boolean executePrint(String document)
	{
		return this.printer.execute(document);
	}
}
