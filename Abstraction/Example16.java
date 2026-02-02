interface IT1
{	void m1();
}
class Demo implements IT1
{	public void m1()
	{
			System.out.println("Inside m1 method");
	}
}
class Example16
{	public static void main(String[] args) 
	{
		System.out.println("Start @ cyber Success");
		Demo d = new Demo();
		d.m1();
		System.out.println("Stop @ cyber Success");
	}
}