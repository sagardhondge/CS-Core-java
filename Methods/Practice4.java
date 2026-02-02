class Demo
{	int a=100;
	static float b=200.5f;
	float m1()
	{	Demo d1= new Demo();
		float res1=d1.a+Demo.b;
		return res1;
	}
	float m2()
	{	Demo d2=new Demo();
		float res2=d2.a+Demo.b;
		return res2;
		System.out.println(m2);
	}
}
class Practice4 
{	static float result1;
	static float result2;
	public static void main(String[] args) 
	{
		System.out.println("Start @ Cyber Success");
		Demo d= new Demo();
		result1=d.m1();
		result2=d.m2();
		float finalResult=result1+result2;
		System.out.println("Final Result = "+ finalResult);
		System.out.println("Stop @ Cyber Success");
	}
}
