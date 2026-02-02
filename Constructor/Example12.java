class class Example12 
{	Example12()
	{			this(10);
		System.out.println("Inside 0 Arg Const");
	}
	Example12(int a)
	{	this();
		System.out.println("Inside 1 Arg Const");
	}
	public static void main(String[] args) 
	{
		System.out.println("Start @ Cyber Success");
		Example12 ref1=new Example12();
		System.out.println("Stop @ Cyber Success");
	}
} 

