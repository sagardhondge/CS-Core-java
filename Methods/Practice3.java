class Demo
{	int a=100;
	static float b=200.5f; 
}

class Practice3 
{	void m1()
	{   Demoo d1= new Demoo();
		System.out.println(d1.a+ Demoo.b);
	}
	void m2()
	{	Demoo d2 = new Demoo();
		System.out.println(d2.a+ Demoo.b);
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
