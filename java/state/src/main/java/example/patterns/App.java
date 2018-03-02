package com.example.patterns;

import com.example.patterns.state.*;
/**
 * State Pattern
 *
 */
public class App
{
    public static void main( String[] args )
    {
    	Tamagotchi pete = new Tamagotchi();


    	boolean exitLoop = false;
    	while(!exitLoop)
    	{
    		System.out.println("What do you want to do?");
    		System.out.println("1: Play");
    		System.out.println("2: Feed");
    		System.out.println("3: Cure");
    		System.out.println("0: Exit game");
    		String input = System.console().readLine();
    		switch(input){
    			case "1":
    				pete.play();
    			break;
    			case "2":
    				pete.feed();
    			break;
    			case "3":
    				pete.cure();
    			break;
    			case "0":
    				exitLoop = true;
    			default:
    			break;
    		}
    	}
    }
}
