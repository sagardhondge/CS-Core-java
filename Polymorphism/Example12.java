class Demo
{	void m1()
	{	System.out.println("Inside Demo -m1 Method");
	}
}
class Sample extends Demo
{	void m1()
	{	System.out.println("Insdide Sample -m1 Method");
	}
}
class Example12
{	public static void main(String[] args)
	{	Sample s= new Sample();
		s.m1();
	}
}