interface It1
{	interface It2
	{	void m1();
	}
}
class Example21 implements It1 , It2
{	public void m1()
	{	System.out.println("Inside m1 method");}
	public static void main(String[] args) 
	{
		System.out.println("Start @ cyber Success");
		Example21 e = new Example21();
		e.m1();
		System.out.println("Stop @ cyber Success");
	}
}

