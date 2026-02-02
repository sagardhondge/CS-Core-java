abstract class Demo
{	Demo()
	{	System.out.println("Inside Demo - 0 arg const");
	}
}
class Sample extends Demo
{	Sample()
	{	System.out.println("Inside Sample - 0 Arg cosnt");
	}
	Sample(int a)
	{	System.out.println("Inside Sample - 1 Arg cosnt");
	}
}
class Example12
{	public static void main(String[] args) 
	{	System.out.println("Start @ cyber Success");
		new Sample();
		new Sample(10);
		System.out.println("Stop @ cyber Success");
	}
}

