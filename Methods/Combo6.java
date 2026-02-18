class Sample
{	static float a=10.5f;
	static void test1()
	{	System.out.println("Inside test1 method");
	}
}
class Combo6 
{	public static void main(String[] args) 
	{	
		System.out.println("Start @ cyber Success");
		Combo6 ref1 = new Combo6();
		ref1.m1();
		System.out.println("Stop @ cyber Success");
	}
	void m1()
	{	System.out.println("Inside m1 method");
		// classname
		System.out.println(Sample.a);
		Sample.test1();
		// object
		Sample ref = new Sample();
		System.out.println(ref.a);
		ref.test1();
	}
}
