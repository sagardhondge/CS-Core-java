class Demo
{	char x='a';
	Demo refvar;
	void test()
	{
		System.out.println(" Inside m1 method " +x);
	}
}

class NonPrimitiveVar11
{
	public static void main(String[] args) 
	{
		System.out.println("Start @ Cyber Success");
		Demo d=new Demo();
		d.refvar=new Demo();
		d.refvar.test();
		System.out.println("Stop @ Cyber Success");
	}
}