package com.example.patterns.state;

/**
 * State Pattern
 *
 */
public class Tamagotchi
{
	private State currentState;

	public Tamagotchi(){
		this.setCurrentState(new HappyState(this));
	}

	public void setCurrentState(State newState)
	{
		this.currentState = newState;
	}

	public void play()
	{
		this.currentState.play();
	}
	public void feed()
	{
		this.currentState.feed();
	}
	public void cure()
	{
		this.currentState.cure();
	}
}
