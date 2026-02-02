class Example10
{
	public static void main(String[] args) 
	{	System.out.println("Start @ Cyber Sucess");
		int[] a={10,20,30};
		try
		{	System.out.println("Inside try block");
			System.out.println(a[10]);
		}
		catch ( ArrayIndexOutOfBoundsException ai)
		{	System.out.println("Alternative sol");
			System.out.println(a[10/0]);
		}
		System.out.println("Stop @ Cyber Sucess");
	}
}