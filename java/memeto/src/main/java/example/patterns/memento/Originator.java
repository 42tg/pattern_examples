package com.example.patterns.memento;

public class Originator<T>
{
	private T state;


	public Memento<T> createMemento()
	{
		return new Memento<T>(state);
	}

	public void setMemento(Memento<T> memento)
	{
		state = memento.state;
	}

	public void setState(T state){
		this.state = state;
		this.setMemento(createMemento());
	}

	public String toString()
	{
		return this.state.toString();
	}
}