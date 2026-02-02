class Outer
{	private int a=10;
	private float b=20.5f;
	class Inner
	{	void  m1()
		{	System.out.println("Inside m1 method");
			System.out.println(a+b);
		}
	}
}

class Example4
{
	public static void main(String[] args) 
	{	
		new Outer().new Inner().m1();
	}
}

