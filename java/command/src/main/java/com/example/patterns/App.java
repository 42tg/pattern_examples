package com.example.patterns;

import com.example.patterns.caller.*;
import com.example.patterns.printer.*;
import com.example.patterns.commands.*;
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

        Manager freddy = new Manager();

        freddy.executePrint(world);
    }
}
