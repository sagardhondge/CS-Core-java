package com.tcs;

class Cefeteria
{	void getSnacks()
	{	System.out.println("Display a list of menu for today");
	}
}
class TcsEmployee 
{
	public static void main(String[] args) 
	{	Cefeteria emp1=new Cefeteria();
		emp1.getSnacks();
	}
}
