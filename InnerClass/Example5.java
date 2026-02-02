class Outer
{	void  m1()
		{	System.out.println("Inside m1 method");
			Inner i = new Inner();
			System.out.println(i.a+i.b);
		}
	class Inner
	{	private int a=100;
		private float b=200.5f;
	}
}

class Example5
{
	public static void main(String[] args) 
	{	
		new Outer().m1();
	}
}

