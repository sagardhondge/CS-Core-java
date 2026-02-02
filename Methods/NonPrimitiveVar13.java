class NonPrimitiveVar13
{	int a =100;
	float b=20.5f;
	static void m1(NonPrimitiveVar13 ref1)
	{	System.out.println("Inside m1 Method");
		System.out.println(ref1.a);
		System.out.println(ref1.b);
	}
	static void test1(NonPrimitiveVar13 refvar1)
	{	System.out.println("Inside test1 Method");
		System.out.println(refvar1.a);
		System.out.println(refvar1.b);
	}

	public static void main(String[] args) 
	{
		System.out.println("Start @ Cyber Success");
		//Named Object
		NonPrimitiveVar13 ref1 = new NonPrimitiveVar13();
		m1(ref1);
		//Nameless Object
		test1(new NonPrimitiveVar13());
		System.out.println("Stop @ Cyber Success");
	}
}