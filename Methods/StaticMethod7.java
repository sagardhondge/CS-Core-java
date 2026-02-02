class StaticMethod7
{
	public static void main(String[] args) 
	{	System.out.println("Start @ cyber Sucess");
		int a =m1();
		System.out.println("The value of a is "+ a);
		System.out.println("Stop @ cyber Sucess");
	}
	static int m1()
	{	System.out.println("Inside m1 Method");
		int a=100;
		return a;
	}
}