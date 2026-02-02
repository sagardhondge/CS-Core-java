class Demo
{	static 
	{	System.out.println("Inside Static Block- demo");	
	}
}
class Sample extends Demo
{	static
	{	System.out.println("Inside Static Block- Sample");	
	}
}
class Example15
{	public static void main(String[] args) 
	{	System.out.println("Start @ cyber Success");
		new Sample();
		System.out.println("Stop @ cyber Success");
	}
}
