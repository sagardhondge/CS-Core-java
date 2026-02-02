class  Example3
{	void m1(float b,int a)
	{System.out.println("Inside float & int Arg");}
	
	void m1(int a,float b)
	{System.out.println("Inside int & float arg");}
	
	public static void main(String[] args) 
	{
		Example3 ref1 = new Example3();
		ref1.m1(10.5f,10);
	}
}
