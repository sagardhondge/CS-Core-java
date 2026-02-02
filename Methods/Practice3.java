class Demo
{	int a=100;
	static float b=200.5f; 
}

class Practice3 
{	void m1()
	{   Demo d1= new Demo();
		System.out.println(d1.a+Demo.b);
	}
	void m2()
	{	Demo d2 = new Demo(); 
		System.out.println(d2.a+Demo.b);
	}
	public static void main(String[] args) 
	{
		System.out.println("Start @ Cyber Success");
		Practice3 p = new Practice3();
		p.m1();
		p.m2();
		System.out.println("Stop @ Cyber Success");
	}
}
