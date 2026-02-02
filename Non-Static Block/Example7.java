class Example7 
{	int a;
	{
		System.out.println("Inside NSB Block"+a);
		a=100;
	}
	public static void main(String[] args) 
	{
		System.out.println("Start @ cyber success");
		Example7 ref1 =  new Example7();
		System.out.println(ref1.a);
		System.out.println("Stop @ cyber success");
	}
}
