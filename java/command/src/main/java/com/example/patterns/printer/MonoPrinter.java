package com.example.patterns.printer;
public class MonoPrinter
{
	public void configure()
	{
		System.out.println("Do monochrome configuration");
	}

	public boolean print(String document)
	{
		System.out.println("Monochrome :" + document);
		return true;
	}

}