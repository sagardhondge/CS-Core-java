class Example7
{	int a;
	Example7()
	{
		System.out.println("Inside the example class Constructor");
		a=100;
	}
	public static void main(String[] args) 
	{
		System.out.println("Start @ Cyber Success");
		Example7 ref1=new Example7();
		System.out.println(ref1.a);
		System.out.println("Start @ Cyber Success");
	}
}