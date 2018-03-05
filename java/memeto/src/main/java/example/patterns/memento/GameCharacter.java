package com.example.patterns.memento;

public class GameCharacter implements Cloneable
{
	//Caracters are identified by name
	private String name;

	//they have an amount of experience which they can invest
	private int exp = 25;

	//each stat cost 5 exp;
	private int agility = 1;
	private int strength = 1;
	private int stamina = 1;

	public GameCharacter(GameCharacter character)
	{
		this.name = new String(character.name);
		this.exp = character.exp;
		this.agility = character.agility;
		this.strength = character.strength;
		this.stamina = character.stamina;
	}

	public GameCharacter(String name)
	{
		this.name = name;
	}

	public void addExp(int exp)
	{
		this.exp += exp;
	}

	public boolean trainAgility()
	{
		if(exp >= 5)
		{
			this.agility 	+= 1;
			this.exp 		-= 5;
			System.out.println("Agility trained");
			return true;
		}
		System.out.println("Not enough Experience");
		return false;
	}

	public boolean trainStrength()
	{
		if(exp >= 5)
		{
			this.strength 	+= 1;
			this.exp 		-= 5;
			System.out.println("Strength trained");
			return true;
		}
		System.out.println("Not enough Experience");
		return false;
	}

	public boolean trainStamina()
	{
		if(exp >= 5)
		{
			this.stamina 	+= 1;
			this.exp 		-= 5;
			System.out.println("Stamina trained");
			return true;
		}
		System.out.println("Not enough Experience");
		return false;
	}

	public GameCharacter clone()
	{
		return new GameCharacter(this);
	}
	public String toString()
	{
		return name + "\t : { Agility : "+ agility +" | Strength : " + strength +" | Stamina :" + stamina +"} ";
	}
}
