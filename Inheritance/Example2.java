class Demo
{	int a=10;
	void m1()
	{
		System.out.println("Inside m1 Method"+a);
	}
}
class Sample extends Demo
{	float b=20.5f;
	void m2()
	{
		System.out.println("Inside m2 Method"+b);
	}
}

class  Example2
{
	public static void main(String[] args) 
	{	//parent
		Demo d =new Demo();
		d.m1();
		System.out.println("------------------");
		//child
		Sample s=new Sample();
		s.m2();
		s.m1();	
	}
}
