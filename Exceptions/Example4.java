class Example4 
{
	public static void main(String[] args) 
	{	System.out.println("Start @ Cyber Sucess");
		try
		{	System.out.println("Inside try block");
			System.out.println(10/0);// object is getting created internally
		}
		catch (ArithmeticException ae)// ae is an refrece varible of an object
		{	System.out.println("Alternative sol");
			System.out.println(10/2);
		}
		System.out.println("Stop @ Cyber Sucess");
	}
}
