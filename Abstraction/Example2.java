abstract class Demo
{	abstract void m1();
}
class Sample extends Demo
{	void m1()
	{
		System.out.println("Inside m1 Method - child class");
	}
}
class Example2 
{
	public static void main(String[] args) 
	{
		Sample s = new Sample();
		s.m1();
	}
}