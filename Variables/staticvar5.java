class Demo
{	static float a=10.5f;
}
class Sample
{	static int b =20;
}
class Sucess
{	static float result;
}
class  staticvar5
{	
	public static void main(String[] args) 
	{
		System.out.println("Start @ cyber success");
		Sucess.result = Demo.a +Sample.b;	
		System.out.println("the result is "+ Sucess.result);
		System.out.println("Stop @ cyber success");
	}
}