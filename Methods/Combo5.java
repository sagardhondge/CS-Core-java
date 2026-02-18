class Combo5 
{	static int a=10;
	static void test1()
	{	System.out.println("Inside test1 method");
	}
	public static void main(String[] args) 
	{	
		System.out.println("Start @ cyber Success");
		Combo5 ref1 = new Combo5();
		ref1.m1();
		System.out.println("Stop @ cyber Success");
	}
	void m1()
	{	System.out.println("Inside m1 method");
		System.out.println(a);
		test1();
		// classname
		System.out.println(Combo5.a);
		Combo5.test1();
		// object
		Combo5 ref = new Combo5();
		System.out.println(ref.a);
		ref.test1();
	}
}
