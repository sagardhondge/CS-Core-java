class Demo
{	int a=100;
	static float b=200.5f;
	float m1()
	{	Demoo d1= new Demoo();
		float res1=d1.a+ Demoo.b;
		return res1;
	}
	float m2()
	{	Demoo d2=new Demoo();
		float res2=d2.a+ Demoo.b;
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
		Demoo d= new Demoo();
		result1=d.m1();
		result2=d.m2();
		float finalResult=result1+result2;
		System.out.println("Final Result = "+ finalResult);
		System.out.println("Stop @ Cyber Success");
	}
}
