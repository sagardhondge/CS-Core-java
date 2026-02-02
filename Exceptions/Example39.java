class Example39 
{	static void m1() Throws ArithmeticException
	{	System.out.println("Inside m1 method");
		System.out.println(10/0);
	}
	public static void main(String[] args) 
	{
		System.out.println("Start @ cyber Success");
		m1();
		System.out.println("Stop @ cyber Success");
	}
}
