
class Cyber
{	Demo m1()
	{	System.out.println("Inisde Cyber -m1 method");
		return new Cyber();
	}
}
class Success extends Cyber
{	Demo m1() 
	{	System.out.println("Inisde Cyber -m1 method");
		return new Success();
	}
}
class Example16
{	public static void main(String[] args)
	{	Success s= new Success();
		s.m1();
	}
}
