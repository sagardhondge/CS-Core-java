class  Example17
{	int a;
	Example17()
	{
		System.out.println("Inside 0 Arg Const "+a);
	}
	Example17(int a)
	{	this();
		this.a =a;
		System.out.println("Inside 1 Arg Const "+a);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Start @ cyber success");
		Example17 ref =new Example17(10);
	}
}
