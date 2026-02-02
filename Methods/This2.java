class This2 
{	int a=250;
	void m1(int a)
	{	System.out.println("Inside M1 Method");
		System.out.println(a);
		// apporach 2 using this keyword 
		System.out.println(this.a);
	}
	public static void main(String[] args) 
	{	
		System.out.println("Start @ cyber sucess");
		This2 ref1 = new This2();
		ref1.m1(100);
		System.out.println("Stop @ Cyber Success");
	}
}
