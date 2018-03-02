package com.example.patterns.state;

import java.util.concurrent.ThreadLocalRandom;

public class HappyState implements State
{
	private Tamagotchi tamagotchi;

	public HappyState(Tamagotchi tamagotchi)
	{
		this.tamagotchi = tamagotchi;
	}

	public void play()
	{
		int randomNum = ThreadLocalRandom.current().nextInt(1, 10 + 1);
		if(randomNum == 10)
		{
			System.out.println("whops im got sick");
			this.tamagotchi.setCurrentState(new SickState(this.tamagotchi));
		}
		else if(randomNum >= 6)
		{
			System.out.println("playing makes me hungry");
			this.tamagotchi.setCurrentState(new HungryState(this.tamagotchi));
		}
		System.out.println("I love playing with you");
	}
	public void feed()
	{
		int randomNum = ThreadLocalRandom.current().nextInt(1, 10 + 1);
		//Im not hungry so im overfeedet... this makes me sick
		if(randomNum >= 3)
		{
			System.out.println("I was not hungry, so im overfeedet, wich makes me feeling Sick :(");
			this.tamagotchi.setCurrentState(new SickState(this.tamagotchi));
		}
	}

	public void cure()
	{
		System.out.println("Im not sick but medicine makes me hungry");
		this.tamagotchi.setCurrentState(new HungryState(this.tamagotchi));
	}
}