class Demo
{	int a=100;
	static float m2()
	{
        Demoo d1=new Demoo();
		float res2=d1.a+Sample.b;
		return res2;
	}
}

class Sample
{	static float b= 200.5f;
	static float m1()
	{	Demoo d2=new Demoo();
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
		float res2 = Demoo.m2();
		float finalResult=res1+res2;
		System.out.println("Final Result : " + finalResult);
		System.out.println("Stop @ cyber Sucess");
	}
}
