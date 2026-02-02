package cyber.sucess;

class  Example3
{
	public static void main(String[] args) 
	{
		System.out.println("Start @ cyber Sucess");
		m1();
		System.out.println("Start @ cyber Sucess");
	}
	static void m1()
	{	System.out.println("Inside M1 Method");
		new Example3().m2();
	}
	static void m2()
	{	System.out.println("Inside M2 Method");
	}
}
