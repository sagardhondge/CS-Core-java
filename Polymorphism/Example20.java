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
class Example20
{	public static void main(String[] args)
	{	//upcasting
		B b1= new C();
		b1.m1(); b1.m2();
		System.out.println("__________");
		//Upcasting
		A a1= (A)b1;
		a1.m1();
		System.out.println("__________");
		//Downcasting
		C c1 = (C)a1;
		c1.m1(); c1.m2(); c1.m3();
		System.out.println("__________");
	}
}