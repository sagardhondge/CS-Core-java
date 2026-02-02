class Demo
{	int a=10;
}
//child
class Sample extends Demo
{	float b=20.5f;
}
class Example1 
{
	public static void main(String[] args) 
	{
		System.out.println("Start @ cyber Success");
		//parent
		Demo d=new Demo();
		System.out.println(d.a);
		System.out.println("-----------");
		//child
		Sample s=new Sample();
		System.out.println(s.b);
		System.out.println(s.a);
	}
}
