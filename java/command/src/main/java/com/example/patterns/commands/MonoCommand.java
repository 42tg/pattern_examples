package com.example.patterns.commands;

import com.example.patterns.printer.MonoPrinter;

public class MonoCommand implements PrintCommand{
	private MonoPrinter printer;

	public MonoCommand(MonoPrinter printer){
		this.printer = printer;
	}

	public boolean execute(String document)
	{
		printer.configure();
		return printer.print(document);
	}
}