package com.example.patterns.iterator;

public class Fries implements Container
{
	public String fries[] = { "French Fries", "Pommes frites", "frieten", "patat"};

	private class FriesIterator implements com.example.patterns.iterator.Iterator
	{
		int index;

		@Override
		public boolean hasNext()
		{
			if(index < fries.length)
			{
				return true;
			}
			return false;
		}

		@Override
		public Object next()
		{
			if(this.hasNext())
			{
				return fries[index++];
			}

			return null;
		}
	}

	@Override
	public Iterator getIterator(){
		return new FriesIterator();
	}
}