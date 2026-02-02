
class Example5
{	static int a;
	static
	{
		System.out.println("Inside Static Block");
		a=100;
	}
	public static void main(String[] args) 
	{
		System.out.println("Start @ cyber Sucess");
		System.out.println(a);
		System.out.println("Stop @ cyber Sucess");
	}
}