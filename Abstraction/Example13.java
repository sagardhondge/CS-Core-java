abstract class Demo
{	Demo()
	{	this(20.5f);
		System.out.println("Inside Demo - 0 arg const");
	}
	Demo(float x)
	{	System.out.println("Inside Demo float - 1 arg const");
	}
}
class Sample extends Demo
{	Sample()
	{	super();
		System.out.println("Inside Sample - 0 Arg cosnt");
	}
	Sample(int a)
	{	this();
		System.out.println("Inside Sample int - 1 Arg cosnt");
	}
}
class Example13
{	public static void main(String[] args) 
	{	System.out.println("Start @ cyber Success");
		new Sample(10);
		System.out.println("Stop @ cyber Success");
	}
}