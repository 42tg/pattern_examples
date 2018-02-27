package com.example.patterns.commands;

import com.example.patterns.printer.ColorPrinter;

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