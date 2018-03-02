package com.example.patterns.caller;

import com.example.patterns.commands.*;
import com.example.patterns.printer.*;

public class Manager
{
	Secretary bob = new Secretary();
	ColorPrinter color = new ColorPrinter();
	public Manager(){
		bob.setPrinter(new ColorCommand(color));
	}

	public boolean executePrint(String document)
	{
		System.out.println("Manager wants to print");
		return this.bob.executePrint(document);
	}
}
