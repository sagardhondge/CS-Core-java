class Example8
{
	public static void main(String[] args) 
	{	System.out.println("Start @ Cyber Sucess");
		int[] a={10,20,30};
		try
		{	System.out.println("Inside try block");
			System.out.println(a[1]);
		}
		catch (ArithmeticException ae)
		{	System.out.println("Alternative sol");
			System.out.println(a[2]);
		}
		System.out.println("Stop @ Cyber Sucess");
	}
}
//if no exseption ocuur in the try block it will not
//throw an error and execute without catch block statements