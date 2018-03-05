package com.example.patterns;

import com.example.patterns.memento.*;
/**
 * Command Pattern
 *
 */
public class App
{
    public static void main( String[] args )
    {
    	Originator<GameCharacter> originator = new Originator<GameCharacter>();
    	Caretaker<GameCharacter> caretaker = new Caretaker<GameCharacter>(originator);

    	GameCharacter bob = new GameCharacter("Bob");
    	GameCharacter august = new GameCharacter("August");

    	originator.setState(bob.clone());
    	caretaker.save();

    	bob.trainStrength();
    	bob.trainStrength();

    	originator.setState(august.clone());
    	caretaker.save();

    	bob.trainStrength();
    	originator.setState(bob.clone());
    	caretaker.save();

    	GameCharacter alice = new GameCharacter("Alice");
    	alice.trainAgility();
    	originator.setState(alice.clone());
    	caretaker.save();

    	System.out.println(originator);

    	System.out.println("-------------------");
    	caretaker.printAll();
    	System.out.println("-------------------");
    	System.out.println(bob);
    	System.out.println(august);
    	System.out.println(alice);
    }
}
