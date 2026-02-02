class Demo
{	interface It1
	{	void test1();
	}
}
class Example22 implements Demo.It1
{	public void test1()
	{	System.out.println("Inside Test1 method");}
	public static void main(String[] args) 
	{
		System.out.println("Start @ cyber Success");
		Example22 ref = new Example22();
		ref.test1();
		System.out.println("Stop @ cyber Success");
	}
}

