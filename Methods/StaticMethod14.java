class Demoo
{	static int x = 100;
	static void test()
	{
		System.out.println("Inside m1 Method");
	}
}
class StaticMethod14
{	public static void main(String[] args) 
	{	System.out.println("Start @ cyber Sucess");
		System.out.println(Demoo.x);
		Demoo.test();
		System.out.println("Stop @ cyber Sucess");
	}
}

