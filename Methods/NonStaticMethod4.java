class NonStaticMethod4 
{	static void m1()
{
	System.out.println("Inside static m1 method");
}
void m2()
{
	System.out.println("Inside Non-Static Method");
}
	public static void main(String[] args) 
	{
		System.out.println("Start @ Cyber Success");
		m1();
		NonStaticMethod4 ref = new NonStaticMethod4();
		ref.m2();
		System.out.println("Stop @ Cyber Success");
	}
}
