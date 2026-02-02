class Example13 
{
	public static void main(String[] args) 
	{	int[] a ={10,20,30};
		try
		{	System.out.println("Inside try block");	
			System.out.println(10/0);
			System.out.println(a[5]);
		}
		catch (Exception e)
		{System.out.println("Inside catch block"+e);
		}
	}
}
