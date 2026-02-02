class Demo
{	int m1()
	{	System.out.println("Inside Demo -m1 Method");
		return 10;
	}
}
class Sample extends Demo
{	float m1()
	{	System.out.println("Insdide Sample -m1 Method");
		return 20.5f;
	}
}
class Example14
{	public static void main(String[] args)
	{	Sample s= new Sample();
		s.m1();
	}
}