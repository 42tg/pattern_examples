package com.patterns.command.commands;

import com.patterns.command.printer.ColorPrinter;

public class ColorCommand implements PrintCommand{
	private ColorPrinter printer;

	public ColorCommand(ColorPrinter printer){
		this.printer = printer;
	}

	public boolean execute(String document)
	{
		printer.configureComplexColors();
		return printer.print(document);
	}
}