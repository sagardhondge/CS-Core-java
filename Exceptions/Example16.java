class Example16
{	static void m2()
		{	System.out.println("Inside  M2 Method");
		try
		{	System.out.println("Inside try  block");	
			System.out.println(10/0);
		}
		catch (Exception e)
		{	//System.out.println(e.toString());
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	static void  m1() 
	{	m2();
		System.out.println("Indie m1 method");
	}
	public static void main(String[] args) 
	{	System.out.println("Start @ cyber Sucess");
		m1();
		System.out.println("Stop @ cyber Sucess");
	}
}