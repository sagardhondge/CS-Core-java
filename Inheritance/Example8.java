final class Demo
{	void m1()
	{
		System.out.println("Inside m1 Method");
	}
}
class Sample extends Demo
{	void m2()
	{
		System.out.println("Inside m2 Method");	
	}
}
class  Example8
{
	public static void main(String[] args) 
	{
		Sample s = new Sample();
		s.m1();
		s.m2();
	}
}
// if use the final keyword at the startof the calss then we can't inherit the parent class 