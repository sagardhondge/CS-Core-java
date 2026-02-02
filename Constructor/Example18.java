class  Example18
{	int a;
	Example18()
	{
		System.out.println("Inside 0 Arg Const "+a);
	}
	Example18(int a)
	{	this();
		this.a =a;
		System.out.println("Inside 1 Arg Const "+a);
	}
	void m1(int a)
	{
		this.a=a;
		System.out.println("Inside m1 Method " +a);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Start @ cyber success");
		Example18 ref =new Example18(10);
		ref.m1(100);
		System.out.println("Stop @ cyber success");		
	}
}
