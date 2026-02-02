class Example14
{
	public static void main(String[] args) 
	{	System.out.println("Start @ cyber Sucess");
		int[] a ={10,20,30};
		try
		{	System.out.println("Before  try - exception block");	
			System.out.println(10/0);
			System.out.println("After  try - exception block");
		}
		catch (Exception e)
		{System.out.println("Inside catch block"+e);
		}
		System.out.println("Stop @ cyber Sucess");
	}
}
//no statemenet will get execued after the exception occurs in the try block 