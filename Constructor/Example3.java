class Example3
{	Example3()
	{
		System.out.println("Inside 1st Contrctor");
	}
	Example3(int a)
	{
		System.out.println("Inside 2nd Contrctor");
	}
	public static void main(String[] args) 
	{
		System.out.println("Start @ Cyber Success");
		Example3 ref1=new Example3(); 
		Example3 ref2=new Example3(100);
		System.out.println("Start @ Cyber Success");
	}
}