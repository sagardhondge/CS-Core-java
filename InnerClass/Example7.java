class Outer
{	int a=15;
	float b=25.5f;	
		
	class Inner extends Outer
	{	int a=150;
		float b=250.5f;
		void  m1(int a, float b)
		{	System.out.println("Inside m1 method");
			System.out.println(a+b);
			System.out.println(this.a+this.b);
			System.out.println(Outer.this.a+Outer.this.b);
		}
	}
}

class Example7
{
	public static void main(String[] args) 
	{	
		new Outer().new Inner().m1(1200,2200.5f);
	}
}

