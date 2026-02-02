class Demo
{	static int m1(int var1)
	{	
		int result1 = var1 +10;
		return result1;
	}
	static float m2(float var2)
	{	
		float result2 = var2 + 20.5f;
		return result2;
	}
}
class StaticMethod9
{
	public static void main(String[] args) 
	{	System.out.println("Start @ cyber Sucess");
		int var1=100;
		float var2=200.5f;
		int result1= Demo.m1(var1);
		float result2 = Demo.m2(var2);
		float FinalResult =result1 + result2;
		System.out.println("The result is "+ FinalResult);
		System.out.println("Stop @ cyber Sucess");
	}
}
