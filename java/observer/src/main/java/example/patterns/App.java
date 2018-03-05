package com.example.patterns;

import com.example.patterns.observer.*;

/**
 * Command Pattern
 *
 */
public class App
{
    public static void main( String[] args )
    {
       Bild bild = new Bild();

       Reciever peter = new Reciever();

       Collector klaus = new Collector();


       bild.addAbo(klaus);
       bild.writeNewspaper(new Newspaper("Influence Virus spreads around the World!"));

       bild.addAbo(peter);
       bild.writeNewspaper(new Newspaper("Project status set to Yellow again!!"));


    }
}
