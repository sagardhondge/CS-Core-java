class Demo
{	Demo(char x, boolean y)
	{System.out.println("Inside char,boolean Arg");}
	Demo(boolean x, char y)
	{System.out.println("Inside boolean,char arg");}
}
class  Example8
{
	public static void main(String[] args) 
	{
		Demo d1 = new Demo(true,'x');
		
	}
}