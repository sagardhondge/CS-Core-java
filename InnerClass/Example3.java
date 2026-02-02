class Outer
{	void  m1()		
	{	System.out.println("Inside m1 method");
		//System.out.println(a+b);
		Inner i = new Inner();
		System.out.println(i.a+i.b);
	}
	class Inner
	{	int a=10;
		float b=20.5f;
	}
}

class Example3
{
	public static void main(String[] args) 
	{	
		new Outer().m1();
	}
}

