class Demo
{	char x='a';
	Demoo refvar;
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
		Demoo d=new Demoo();
		d.refvar=new Demoo();
		d.refvar.test();
		System.out.println("Stop @ Cyber Success");
	}
}