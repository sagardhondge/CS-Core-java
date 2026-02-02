class StaticMethod8
{
	public static void main(String[] args) 
	{	System.out.println("Start @ cyber Sucess");
		int num1=10;int num2=20;
		int result = add(num1,num2);
		System.out.println("The result is "+ result);
		System.out.println("Stop @ cyber Sucess");
	}
	static int add(int num1 ,int num2)
	{	System.out.println("Inside m1 Method");
		int result = num1 + num2;
		return result;
	}
}
