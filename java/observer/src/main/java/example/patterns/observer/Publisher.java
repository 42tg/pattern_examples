package com.example.patterns.observer;

import java.util.List;
import java.util.ArrayList;

public abstract class Publisher
{
	private List<NewspaperAbo> abos = new ArrayList<NewspaperAbo>();

	public void addAbo(NewspaperAbo abo)
	{
		this.abos.add(abo);
	}
	public void removeAbo(NewspaperAbo abo)
	{
		this.abos.remove(abo);
	}

	public void publishNewspaper(Newspaper newspaper)
	{
		for (NewspaperAbo current : abos)
		{
			current.publish(newspaper);
		}
	}
}
