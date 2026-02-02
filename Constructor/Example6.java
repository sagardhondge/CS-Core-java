class Sample
{	
	{
		System.out.println("Inside the sample class Constructor");
	}
}
class Example6
{	Example6()
	{
		System.out.println("Inside the example class Constructor");
	}
	public static void main(String[] args) 
	{
		System.out.println("Start @ Cyber Success");
		Example6 ref1=new Example6();
		Sample ref2 = new Sample();
		System.out.println("Start @ Cyber Success");
	}
}

