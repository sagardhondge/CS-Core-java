class Example23
{
	public static void main(String[] args) 
	{	int [] a={10,20,30};
		System.out.println("Start @ cyber Sucess");
		try
		{
			System.out.println("Inside try block");
			System.out.println(a[10]);
		}
		catch (Exception ai)
		{	System.out.println("Inside Catch Block");
		}
		finally 
		{
			System.out.println("Inside Finally Block");
		}
		System.out.println("Stop @ cyber success");
	}
}
