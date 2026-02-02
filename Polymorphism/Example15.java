class Demo
{
}
class Cyber
{	Demo m1()
	{	System.out.println("Inisde Cyber -m1 method");
		return new Demo();
	}
}
class Success extends Cyber
{	Demo m1() 
	{	System.out.println("Inisde Cyber -m1 method");
		return new Demo();
	}
}
class Example15
{	public static void main(String[] args)
	{	Success s= new Success();
		s.m1();
	}
}