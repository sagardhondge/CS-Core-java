class Example6
{	{
		System.out.println("Inside NSB One");
	}
	{
		System.out.println("Inside NSB two");
	}
	Example6()
	{
		System.out.println("Inside 0 arg constructor");
	}
	public static void main(String[] args) 
	{
		System.out.println("Start @ cybeer success");
		Example6 ref1 = new Example6();
		Example6 ref2 = new Example6();
		System.out.println("Start @ cybeer success");
	}
}
