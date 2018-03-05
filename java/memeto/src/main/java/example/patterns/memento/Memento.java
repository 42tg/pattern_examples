package com.example.patterns.memento;

public class Memento<T>
{
	public T state;

	public Memento(T state)
	{
		this.state = state;
	}

	public String toString()
	{
		return this.state.toString();
	}
}