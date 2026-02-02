abstract class Demo
{	abstract void m1();
	void m2()
	{
		System.out.println("Inside m2 Method - parent class");
	}
}
class Sample extends Demo
{	void m1()
	{
		System.out.println("Inside m1 Method - child class");
	}
}
class Example4
{
	public static void main(String[] args) 
	{	Demo d = new Sample();
		d.m1();
		d.m2();
	}
}