class NonPrimitiveVar2 
{	int a=100;
	float b=20.5f;
	public static void main(String[] args) 
	{
		System.out.println("Start @cyber Success");
		NonPrimitiveVar2 ref1=new NonPrimitiveVar2();
		System.out.println(ref1.a+ref1.b);
		m1(ref1);
		System.out.println("Stop @ cyber success");
	}
	static void m1(NonPrimitiveVar2 ref2)
	{	System.out.println("Inside m1 Method");
		System.out.println(ref2.a+ref2.b);
	}
}
