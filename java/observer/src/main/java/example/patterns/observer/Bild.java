package com.example.patterns.observer;

import java.util.List;
import java.util.ArrayList;

public class Bild extends Publisher
{
	List<Newspaper> publishedNewspapers = new ArrayList();

	public void writeNewspaper(Newspaper newspaper)
	{
		this.publishedNewspapers.add(newspaper);
		this.publishNewspaper(newspaper);
	}
}