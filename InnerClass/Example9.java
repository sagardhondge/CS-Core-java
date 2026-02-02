//2.2->Method Local Instance Variable
class Outer
{	void m1()
	{	class Inner
		{	int a=10;
		}
		Inner i = new Inner();
		System.out.println(i.a);
	}
	
}
class  Example9
{
	public static void main(String[] args) 
	{	new Outer().m1();
	}
}
