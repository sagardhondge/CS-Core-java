class Practice1 
{	static int a=10;
	  float b=20.5f;
	public static void main(String[] args) 
	{
		System.out.println("Start @ cyber success");
		Practice1 ref1=new Practice1();
		float result1=a+ref1.b;
		System.out.println("The Result is " +result1);
		ref1.m1();
		System.out.println("stop @cyber Success");
	}
	void m1()
	{	System.out.println("Inside m1 Method");
		float result2= a+b;
		System.out.println(result2);
	}
}
