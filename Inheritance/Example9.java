class Demo
{	static int a=100;
	static void m1()
	{
		System.out.println("Inside M1 Method");
	}
}
class Sample extends Demo
{
}
class Example9 
{
	public static void main(String[] args) 
	{
		System.out.println(Sample.a);
		Sample.m1();
	}
}

