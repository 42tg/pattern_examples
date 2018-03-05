package com.example.patterns.observer;

public class Reciever implements NewspaperAbo
{
	private Newspaper newspaper;

	public void publish(Newspaper newspaper)
	{
		this.newspaper = newspaper;
		System.out.println("The Reciever gets the Newspaper : "+ newspaper.getTitle());
	}
}