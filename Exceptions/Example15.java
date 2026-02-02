class Example15
{
	public static void main(String[] args) 
	{	System.out.println("Start @ cyber Sucess");
		int[] a ={10,20,30};
		try
		{	System.out.println("Before  try - exception block");	
			System.out.println(10/0);
		}
		catch (Exception e)
		{	System.out.println(e.toString());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Stop @ cyber Sucess");
	}
}
// three methods to print the exception
//1.toString() 2.getMessage() 3.printStackTrace();