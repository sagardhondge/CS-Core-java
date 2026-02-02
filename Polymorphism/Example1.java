class  Example1
{	void m1()
	{System.out.println("Inside o Arg");}
	
	void m1(int a)
	{System.out.println("Inside int arg");}
	
	public static void main(String[] args) 
	{
		Example1 ref1 = new Example1();
		ref1.m1(10);
	}
}
