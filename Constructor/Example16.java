class Example16
{	Example16(int x,float y)
	{
		System.out.println("Inside 2 arg Construtor");
	}
	Example16(int x)
	{
		System.out.println("Inside 1 arg Construtor");
	}
	Example16()
	{	this(10,20.5f);
		this(10);
		System.out.println("Inside 0 arg Construtor");
	}
	public static void main(String[] args) 
	{
		System.out.println("Start @ cyber Success");
		Example16 ref1 =new Example16();
		System.out.println("Stop @ cyber Success");
	}
}
