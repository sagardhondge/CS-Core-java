class Demo
{	int a=100;
	static float m2()
	{Demo d1=new Demo();
		float res2=d1.a+Sample.b;
		return res2;
	}
}

class Sample
{	static float b= 200.5f;
	static float m1()
	{	Demo d2=new Demo();
		float res1= d2.a+b;
		return res1;
	}
}

class Practice5 
{
	public static void main(String[] args) 
	{
		System.out.println("Start @ Cyber Success");
		
		float res1 = Sample.m1();
		float res2 = Demo.m2();
		float finalResult=res1+res2;
		System.out.println("Final Result : " + finalResult);
		System.out.println("Stop @ cyber Sucess");
	}
}
