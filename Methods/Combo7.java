class Combo7 
{	int a=10;
	void test1()
	{	System.out.println("Inside test1 method");
	}
	public static void main(String[] args) 
	{	
		System.out.println("Start @ cyber Success");
		Combo7 ref1 = new Combo7();
		ref1.m1();
		System.out.println("Stop @ cyber Success");
	}
	void m1()
	{	System.out.println("Inside m1 method");
		// Directly
		System.out.println(a);
		test1();
		// object
		Combo7 ref = new Combo7();
		System.out.println(ref.a);
		ref.test1();
	}
}
