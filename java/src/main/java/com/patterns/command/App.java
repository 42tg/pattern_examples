package com.patterns.command;

import com.patterns.command.caller.*;
import com.patterns.command.printer.*;
import com.patterns.command.commands.*;
/**
 * Command Pattern
 *
 */
public class App
{
    public static void main( String[] args )
    {
    	ColorPrinter color = new ColorPrinter();
    	MonoPrinter mono = new MonoPrinter();
    	Secretary bob = new Secretary();
    	String world = "Hello World!";
    	bob.executePrint(world);
    	bob.setPrinter(new ColorCommand(color));
    	bob.executePrint(world);
    	bob.setPrinter(new MonoCommand(mono));
    	bob.executePrint(world);
        System.out.println( world );
    }
}
