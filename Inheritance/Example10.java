class Demo
{	static int x=10;
}
class Sample extends Demo
{	int x=20;
	void m1(int x)
	{	System.out.println("Inside m1 Method");
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
	}
}
class Example10 
{	
	public static void main(String[] args) 
	{	Sample s =new Sample();
		s.m1(30);
	}
}