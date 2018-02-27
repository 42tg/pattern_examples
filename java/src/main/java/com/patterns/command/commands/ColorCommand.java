package com.patterns.command.commands;

import com.patterns.command.printer.ColorPrinter;

public class ColorCommand implements PrintCommand{
	private ColorPrinter printer;

	public ColorCommand(ColorPrinter printer){
		this.printer = printer;
	}

	public boolean execute(String document)
	{
		printer.configure();
		return printer.print(document);
	}
}