class NonPrimitiveVar6 
{	char x='a';
	static NonPrimitiveVar6 ref;
	public static void main(String[] args) 
	{
		System.out.println("Start @ Cyber Success");
		ref = new NonPrimitiveVar6();
		System.out.println(ref.x);
		m1();
		System.out.println("Stop @ Cyber Success");
	}
	static void m1()
	{
		System.out.println("Inside m1 Method");
		System.out.println(ref.x);
	}
}
