class Demo
{	static float var2=200.5f;
	static int m1(int x)
	{	int result1 = Sample.var1 +x;
		return result1;
	}
}
class Sample
{	static int var1=100;
	static float m2(float y)
	{	float result2 = Demo.var2 + 20.5f;
		return result2;
	}
}
class StaticMethod10
{
	public static void main(String[] args) 
	{	System.out.println("Start @ cyber Sucess");
		int x=10;
		float y=20.5f;
		int result1= Demo.m1(x);
		float result2 = Sample.m2(y);
		float FinalResult =result1 + result2;
		System.out.println("The result is "+ FinalResult);
		System.out.println("Stop @ cyber Sucess");
	}
}
