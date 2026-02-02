class Example29
{
	public static void main(String[] args) 
{
		System.out.println("Start @ cyber Sucess");
		System.out.println(10/0);
		try
		{	System.out.println("Inside try block");
		}
		catch (ArithmeticException ae)
		{	System.out.println("Inside Catch Block");
		}
		finally 
		{
			System.out.println("Inside Finally Block");
		}
		System.out.println("Stop @ cyber success");
	}
}
