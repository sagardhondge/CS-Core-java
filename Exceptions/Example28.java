class Example28
{
	public static void main(String[] args) 
{
		System.out.println("Start @ cyber Sucess");
		try
		{
			System.out.println("Inside try block");
			System.out.println(10/0);
		}
		catch (ArithmeticException ae)
		{	System.out.println("Inside Catch Block");
			System.exit(0);
		}
		finally 
		{
			System.out.println("Inside Finally Block");
		}
		System.out.println("Stop @ cyber success");
	}
}
