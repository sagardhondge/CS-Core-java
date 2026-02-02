interface Demo
{	default void test1()
	{	System.out.println("Inside m1 Method");
	}
}
class Example23 implements Demo
{	
	public static void main(String[] args) 
	{
		System.out.println("Start @ cyber Success");
		Demo d = new Example23();
		d.test1();
		System.out.println("Stop @ cyber Success");
	}
}
