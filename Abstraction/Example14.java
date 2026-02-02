class Demo
{	{	System.out.println("Inside Instace Block- demo");	
	}
}
class Sample extends Demo
{	{	System.out.println("Inside Instace Block- Sample");	
	}
}
class Example14
{	public static void main(String[] args) 
	{	System.out.println("Start @ cyber Success");
		new Sample();
		System.out.println("Stop @ cyber Success");
	}
}