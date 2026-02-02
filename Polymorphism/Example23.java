class Sample
{	void m1()
	{	System.out.println("Iniside m1 method - Demo Class");
	}
}
class Demo extends Sample
{	void m1()
	{	System.out.println("Iniside m1 method - Sample class");
	}
}
class Example23
{	public static void main(String[] args)
	{	Sample s = new Demo
		s.m1();
	}
}
