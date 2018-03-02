package com.example.patterns.state;

import java.util.concurrent.ThreadLocalRandom;

public class HungryState implements State
{
	private Tamagotchi tamagotchi;

	public HungryState(Tamagotchi tamagotchi)
	{
		this.tamagotchi = tamagotchi;
	}

	public void play()
	{
		System.out.println("im Hungry i dont like to play");
	}

	public void feed()
	{
		int randomNum = ThreadLocalRandom.current().nextInt(1, 10 + 1);
		//i got healed <3
		if(randomNum >=8){
			System.out.println("Oh I eat too much!");
			this.tamagotchi.setCurrentState(new SickState(this.tamagotchi));
		}
		else {
			System.out.println("Mjum mjum, im statisfied!");
			this.tamagotchi.setCurrentState(new HappyState(this.tamagotchi));
		}
	}

	public void cure()
	{
		System.out.println("im Hungry i dont want medicine");
	}
}