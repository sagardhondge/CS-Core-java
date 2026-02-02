abstract class Demo
{	abstract void m1();
}
class Sample extends Demo
{	void m1()
	{
		System.out.println("Inside m1 Method - child class");
	}
}
class Example3
{
	public static void main(String[] args) 
	{
		Sample s = new Sample();
		s.m1();
		//Demo d = new Demo();Invalid
		Demo d = new Sample();
		d.m1();
	}
}