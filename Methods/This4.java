class This4
{	int a=1000;
	static void m1(int a)
	{	System.out.println("Inside M1 Method");
		System.out.println(a);
		System.out.println(this.a);
	}
	public static void main(String[] args) 
	{	
		System.out.println("Start @ cyber sucess");
		This3 ref1 = new This3();	
		ref1.m1(10);
		System.out.println("Stop @ Cyber Success");
	}
}