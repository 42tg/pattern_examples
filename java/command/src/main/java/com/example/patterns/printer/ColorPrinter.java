package com.example.patterns.printer;
public class ColorPrinter
{
	public void configureComplexColors()
	{
		System.out.println("Do color configuration");
	}

	public boolean print(String document)
	{
		System.out.println("Colorfull :" + document);
		return true;
	}

}