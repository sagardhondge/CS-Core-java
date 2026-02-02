abstract class Demo
{	abstract void m1();
	abstract void m1();
}
class Sample extends Demo
{	void m1()
	{	System.out.println("Inside m1 Method");
	}
	void m2()
	{	System.out.println("Inside m1 Method");
	}
}
class Example15
{
	public static void main(String[] args) 
	{	Sample s = new Sample();
		s.m1();
		s.m2();
	}
}