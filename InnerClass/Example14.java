class Outer
{	 int a=10;
	 float b= 20.5f;
	static class Inner
	{	void m1()
		{	System.out.println("Inside M1 Method");	
			Outer o = new Outer();
			System.out.println(o.a+o.b);
		}
	}
}

class Example14
{
	public static void main(String[] args) 
	{	Outer.Inner i = new Outer.Inner();
		i.m1();
	}
}