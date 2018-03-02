package com.example.patterns;

/**
 * Command Pattern
 *
 */
public class App
{
    public static void main( String[] args )
    {
       System.out.println("Fries in different Languages:");
       com.example.patterns.iterator.Fries fries = new com.example.patterns.iterator.Fries();
       for(com.example.patterns.iterator.Iterator it = fries.getIterator(); it.hasNext();)
       {
       		String frie = (String) it.next();
       		System.out.println(frie);
       }
    }
}
