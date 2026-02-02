class  Example4
{	void m1(float b)
	{	System.out.println("inside float");
	}
	void m1(float b,int a)
	{System.out.println("Inside float & int Arg");}
	
	void m1(int a)
	{System.out.println("Inside int ");}
	
	public static void main(String[] args) 
	{
		Example4 ref1 = new Example4();
		ref1.m1(10);
	}
}
