class class Example11 
{	Example11()
	{
		System.out.println("Inside 0 Arg Const");
		this(10);
	}
	Example11(int a)
	{
		System.out.println("Inside 1 Arg Const");
	}
	public static void main(String[] args) 
	{
		System.out.println("Start @ Cyber Success");
		Example11 ref1=new Example11();
		System.out.println("Stop @ Cyber Success");
	}
} 

