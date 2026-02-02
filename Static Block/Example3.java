class Example3 
{	static
	{
		System.out.println("Inside Static Block");
	}
	{
		System.out.println("Inside Static Block");
	}
	public static void main(String[] args) 
	{
		System.out.println("Start @ cyber Sucess");
		Example3 ref1= new Example3();
		Example3 ref2= new Example3();
		System.out.println("Stop @ cyber Sucess");
	}
}
