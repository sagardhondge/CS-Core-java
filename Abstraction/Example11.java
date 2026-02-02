abstract class Demo
{	Demo()
	{	System.out.println("Inside Demo - 0 arg const");
	}
}
class Sample extends Demo
{	Sample()
	{	System.out.println("Inside Sample - 0 Arg cosnt");
	}
}
class Example11 
{	public static void main(String[] args) 
	{	System.out.println("Start @ cyber Success");
		new Sample();
		System.out.println("Stop @ cyber Success");
	}
}

