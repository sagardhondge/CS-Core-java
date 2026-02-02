abstract class Demo
{	abstract void m1();
	abstract void m2();
}
abstract class Sample extends Demo
{	void m1()
	{
		System.out.println("Inside m1 Method- Sample");
	}
}
class Lenovo extends Sample
{	void m2()
	{
		System.out.println("Inside m2 method- Lenovo");	
	}
}

class Example8
{
	public static void main(String[] args) 
	{	Lenovo ref = new Lenovo();
		ref.m1();
		ref.m2();
	}
}