
class Outer
{	void m1()
	{	class Inner
		{	int a=10;
		}
		Inner i = new Inner();
		System.out.println(i.a);
	}
	void m2()
	{	class Inner
		{	float b=10.5f;
		}
		Inner i = new Inner();
		System.out.println(i.b);
	}
	
}
class  Example10
{
	public static void main(String[] args) 
	{	Outer o = new Outer();
		o.m1();
		o.m2();
	}
}
