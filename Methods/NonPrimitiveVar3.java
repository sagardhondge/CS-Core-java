class NonPrimitiveVar3 
{	int a=10;
	float b=20.5f;
	public static void main(String[] args) 
	{
		System.out.println("Start @ Cyber Success");
		NonPrimitiveVar3 ref=m1();
		System.out.println("Back to main");
		System.out.println(ref.a+ref.b);
		System.out.println("Stop @ Cyber Success");
	}
	static NonPrimitiveVar3 m1()
	{
		System.out.println("Inside m1 Method");
		NonPrimitiveVar3 ref = new NonPrimitiveVar3();
		System.out.println(ref.a+ref.b);
		return ref;
	}
}
