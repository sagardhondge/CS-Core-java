class NonStaticMethod1 
{	public static void main(String[] args) 
	{
		System.out.println("satrt @ cyber sucess");
		NonStaticMethod1 ref1 = new NonStaticMethod1();
		ref1.m1();
		System.out.println("satrt @ cyber sucess");
	}
	void m1()
	{	System.out.println("Inisde m1 Method");
	}
}