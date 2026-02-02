class  Example2
{	void m1(float b)
	{System.out.println("Inside float Arg");}
	
	void m1(int a)
	{System.out.println("Inside int arg");}
	
	public static void main(String[] args) 
	{
		Example2 ref1 = new Example2();
		ref1.m1(10.5f);
	}
}
