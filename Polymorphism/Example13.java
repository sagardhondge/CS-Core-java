class Demo
{	int m1()
	{	System.out.println("Inside Demo -m1 Method");
		return 10;
	}
}
class Sample extends Demo
{	int m1()
	{	System.out.println("Insdide Sample -m1 Method");
		return 100;
	}
}
class Example13
{	public static void main(String[] args)
	{	Sample s= new Sample();
		s.m1();
	}
}