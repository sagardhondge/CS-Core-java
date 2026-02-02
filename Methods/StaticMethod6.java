class StaticMethod6
{
	public static void main(String[] args) 
	{	System.out.println("Start @ cyber Sucess");
		int length=100, breadth=200;
		m1(length,breadth);
		System.out.println("Stop @ cyber Sucess");
	}
	static void m1(int l,int b)
	{	System.out.println("Inside m1 Method");
		int result = l*b;
		System.out.println("The result is "+ result);
	}
}
