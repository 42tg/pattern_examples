package com.example.patterns.memento;

import java.util.List;
import java.util.ArrayList;

public class Caretaker<T>
{
	private List<Memento<T>> mementoList = new ArrayList<Memento<T>>();

	private Originator<T> originator;

	public Caretaker(Originator<T> originator)
	{
		this.originator = originator;
	}

	public Originator<T> getOriginator()
	{
		return originator;
	}

	public void setOriginator(Originator<T> originator)
	{
		this.originator = originator;
	}

	public Memento<T> save()
	{
		Memento<T> memento = originator.createMemento();
		mementoList.add(memento);
		System.out.println(memento.toString());
		return memento;
	}

	public boolean restore(int index)
	{
		try{
			Memento<T> memento = mementoList.get(index);
			originator.setMemento(memento);
			System.out.println(memento.toString());
			return true;
		} catch (Exception e)
		{
			System.out.println("Cannot Restore memento at index " + index);
			return false;
		}
	}


	public void printAll()
	{
		for (Memento<T> item : mementoList) {
			System.out.println(item.toString());
		}
	}
}