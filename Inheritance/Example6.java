class A
{	void m1()
	{
		System.out.println("Inside m1 method - A");
	}
}
class B extends A
{	void m2()
	{
		System.out.println("Inside m2 method - b");
	}
}
class C extends A
{	void m3()
	{
		System.out.println("Inside m3 method - c");
	}
}
class D extends B
{
}
class E extends C
{
}
class Example6
{
	public static void main(String[] args) 
	{	D d1 =new D(); d1.m1(); d1.m2();
		E e1 =new E(); e1.m1(); e1.m3();
	}
}