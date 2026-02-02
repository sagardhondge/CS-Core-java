class Example17
{
	public static void main(String[] args) 
	{	System.out.println("Start @ cyber Sucess");
		int[] a ={10,20,30};
		try
		{	System.out.println("Before  try - exception block");	
			System.out.println(10/0);
			System.out.println(a[20]);
		}
		catch (ArithmeticException ae)
		{System.out.println("Inside ArithmeticException catch block"+ae);
		}
		catch (Exception e)
		{System.out.println("Inside Exception catch block"+e);
		}
		System.out.println("Stop @ cyber Sucess");
	}
}
// an hireachical ploymorphism occur in this example where ArithmeticException is the child class of Exception