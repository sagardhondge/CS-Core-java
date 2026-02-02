class Outer
{	int a=15;
	float b=25.5f;	
		
	class Inner extends Outer
	{
		void  m1()
		{	System.out.println("Inside m1 method");
			System.out.println(a+b);
		}
	}
}

class Example8
{
	public static void main(String[] args) 
	{	
		new Outer().new Inner().m1();
	}
}

