class Parent
{	int a=10;
}
class Child extends Parent
{	float b=20.5f;
}
class Example18
{	public static void main(String[] args)
	{	//upcasting
		Parent p = new Child();
		System.out.println(p.a);
		//Downcasting
		Child c=(Child)p;
		System.out.println(c.b);
		System.out.println(c.a);
	}
}