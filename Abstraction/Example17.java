interface IT1
{	void m1();
}
class Demo implements IT1
{	public void m1()
	{	System.out.println("Inside m1 method - Demo");
	}
}
class Sample extends Demo
{	public void m2()
	{	System.out.println("Inside m2 method- sample");
	}
}
class Example17
{	public static void main(String[] args) 
	{
		System.out.println("Start @ cyber Success");
		Sample s = new Sample();
		s.m1();
		s.m2();
		System.out.println("Stop @ cyber Success");
	}
}
