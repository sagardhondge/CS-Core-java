class Example10 
{	Example10()
	{	this(10);
		System.out.println("Inside 0 Arg Const");
	}
	Example10(int a)
	{
		System.out.println("Inside 1 Arg Const");
	}
	public static void main(String[] args) 
	{
		System.out.println("Start @ Cyber Success");
		Example10 ref1=new Example10();
		System.out.println("Stop @ Cyber Success");
	}
}
// this -> keyword -> it holds address of the current object
//this() -> Statement/Method -> It calls another Constructor within the same class