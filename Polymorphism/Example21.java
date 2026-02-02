class A
{	int a=10;
	void m1()
	{	System.out.println("Inside  A m1 method "+a);
	}
}
class B extends A
{	float b=20.5f;
	void m2()
	{	System.out.println("Inside B m2 method "+b);
	}
}
class C extends B
{	char c='x';
	void m3()
	{	System.out.println("Inside C m2 method "+c);
	}
}
class Sample
{	static void test(A aa)
	{	aa.m1(); }
}
class Example21
{	public static void main(String[] args)
	{	Sample.test(new C());
	}
}