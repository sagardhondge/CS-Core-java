class Example20
{
	public static void main(String[] args) 
	{	System.out.println("Start @ cyber Sucess");
		int[] a ={10,20,30};
		try
		{	System.out.println("Before  try  block");	
			System.out.println(a[20]);
		}
		catch (ArrayIndexOutOfBoundsException ai)
        {
            System.out.println("Inside ArrayIndexOutOfBoundsException catch block: " + ai);

            try
            {
                System.out.println("Inside inner try block of catch");
                System.out.println(10 /0);
            }
            catch (ArithmeticException ae)
            {
                System.out.println("Inside inner catch block");
            }
		}
	}
}
