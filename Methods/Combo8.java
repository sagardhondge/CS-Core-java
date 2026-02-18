class Sample
{	float a=10.5f;
	void test1()
	{	System.out.println("Inside test1 method");
	}
}
class Combo8 
{	public static void main(String[] args) 
	{	
		System.out.println("Start @ cyber Success");
		Combo8 ref1 = new Combo8();
		ref1.m1();
		System.out.println("Stop @ cyber Success");
	}
	void m1()
	{	System.out.println("Inside m1 method");
		Sample ref = new Sample();
		System.out.println(ref.a);
		ref.test1();
	}
}
