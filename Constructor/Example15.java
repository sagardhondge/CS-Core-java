class Example15
{	Example15(int x,float y)
	{
		System.out.println("Inside 2 arg Construtor");
	}
	Example15(int x)
	{	this(10,20.5f);
		System.out.println("Inside 1 arg Construtor");
	}
	Example15()
	{	this(10);
		System.out.println("Inside 0 arg Construtor");
	}
	public static void main(String[] args) 
	{
		System.out.println("Start @ cyber Success");
		Example15 ref1 =new Example15();
		System.out.println("Stop @ cyber Success");
	}
}