abstract class Demo
{	abstract void m1();
	abstract void m2();
}

class Example16
{	static Demo d= new Demo()
	{
		void m1()
		{	System.out.println("Inside m1 Method");
		}
		void m2()
		{	System.out.println("Inside m1 Method");
		}
	};
	public static void main(String[] args) 
	{	d.m1();
		d.m2();
	}
}