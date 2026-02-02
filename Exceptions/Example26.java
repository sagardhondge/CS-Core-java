class Example26
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
		}
		finally 
		{
			System.out.println("Inside Finally Block");
			System.out.println(10/0);
		}
		System.out.println("Stop @ cyber success");
	}
}
