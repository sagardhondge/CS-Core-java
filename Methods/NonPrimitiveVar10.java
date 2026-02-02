class NonPrimitiveVar10
{	int a =100;
	void m1()
	{
		System.out.println("Inside M1 method" +a);
	}
	NonPrimitiveVar10 refvar;
	public static void main(String[] args) 
	{
		System.out.println("Start @ Cyber Success");
		NonPrimitiveVar10 retval = new NonPrimitiveVar10();
		retval.refvar=new NonPrimitiveVar10();
		retval.refvar.m1();
		System.out.println("Stop @ Cyber Success");
	}
}