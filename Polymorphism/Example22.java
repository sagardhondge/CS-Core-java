class Demo
{	void m1()
	{	System.out.println("Iniside m1 method - Demo Class");
	}
}
class Sample extends Demo
{	void m1()
	{	System.out.println("Iniside m1 method - Sample class");
	}
}
class Example22
{	public static void main(String[] args)
	{	Demo d = new Sample();
		d.m1();
	}
}
