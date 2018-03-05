package com.example.patterns.observer;

import java.util.List;
import java.util.ArrayList;

public class Collector implements NewspaperAbo
{
	private List<Newspaper> newspapers = new ArrayList<Newspaper>();

	public void publish(Newspaper newspaper)
	{
		this.newspapers.add(newspaper);
		System.out.println("The Collector stores the Newspaper : "+ newspaper.getTitle());
	}
}