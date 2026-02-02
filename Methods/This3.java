class This3 
{	int a=1000;
	void m1(int a)
	{	System.out.println("Inside M1 Method");
		System.out.println(a);
		System.out.println(this.a);
	}
	public static void main(String[] args) 
	{	
		System.out.println("Start @ cyber sucess");
		This3 ref1 = new This3();
		This3 ref2 = new This3();	
		ref1.m1(10);
		ref2.m1(100);
		System.out.println("Stop @ Cyber Success");
	}
}