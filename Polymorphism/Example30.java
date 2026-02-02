class Parent
{	void m1()
	{	System.out.println("Inside m1 methos - Parent");	
	}
	void m2()
	{	System.out.println("Inside m2 methos - Parent");	
	}
}
class Child extends Parent
{	void m1()
	{	System.out.println("Inside m1 methos - Child");	
	}
	void m3()
	{	System.out.println("Inside m3 methos - child");	
	}
}
class Example30
{
	public static void main(String[] args) 
	{	Parent p = new Child();
		p.m1(); p.m2();
		Child c= (Child)p;
		c.m3();	
	}
}