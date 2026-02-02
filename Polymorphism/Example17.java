class Cyber
{	final void m1()
	{	System.out.println("Inisde Cyber -m1 method");
	}
}
class Success extends Cyber
{	void m1() 
	{	System.out.println("Inisde Cyber -m1 method");
	}
}
class Example17
{	public static void main(String[] args)
	{	Success s= new Success();
		s.m1();
	}
}
