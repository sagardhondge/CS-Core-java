class Example2
{	{
		System.out.println("Inside Non-static Block");
	}
	Example2()
	{
		System.out.println("Inside arged Constructor");
	}
	public static void main(String[] args) 
	{
		System.out.println("Start @ cybeer success");
		Example2 ref = new Example2();
		System.out.println("Start @ cybeer success");
	}
}