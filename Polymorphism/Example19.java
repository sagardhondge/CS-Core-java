class Parent
{	int a=10;
	void m1()
	{	System.out.println("Inside m1 method "+a);
	}
}
class Child extends Parent
{	float b=20.5f;
	void m2()
	{	System.out.println("Inside m2 method "+b);
	}
}
class Example19
{	public static void main(String[] args)
	{	//upcasting
		Parent p = new Child();
		p.m1();
		//Downcasting
		Child c=(Child)p;
		c.m1(); c.m2();
	}
}