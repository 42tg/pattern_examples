package com.example.patterns;


import com.example.patterns.strategy.*;
/**
 * Strategy Patterns
 *
 */
public class App
{
    public static void main( String[] args )
    {
    	Husky husky = new Husky();
    	husky.bark();
    	husky.run();
    	Chiwawa chiwawa = new Chiwawa();
    	chiwawa.bark();
    	chiwawa.run();
    }
}
