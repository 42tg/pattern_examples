package com.example.patterns.state;

import java.util.concurrent.ThreadLocalRandom;

public class SickState implements State
{
	private Tamagotchi tamagotchi;

	public SickState(Tamagotchi tamagotchi)
	{
		this.tamagotchi = tamagotchi;
	}

	public void play()
	{
		System.out.println("im Sick i dont like to play");
	}

	public void feed()
	{
		System.out.println("im Sick i dont want to Eat");
	}

	public void cure()
	{
		int randomNum = ThreadLocalRandom.current().nextInt(1, 10 + 1);
		//i got healed <3
		if(randomNum >=6){
			System.out.println("Im feeling better now!");
			this.tamagotchi.setCurrentState(new HappyState(this.tamagotchi));
		}
		else {
			System.out.println("Im feeling better now, but the medicine makes me hungry!");
			this.tamagotchi.setCurrentState(new HungryState(this.tamagotchi));
		}
	}
}