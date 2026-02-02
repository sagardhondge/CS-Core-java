
class Parent
{	static
	{	System.out.println("Inside Parent static block");
	}
}
class Child extends Parent
{	static
	{	
		System.out.println("Inside Child Static block");
	}
}
class Example21
{
	public static void main(String[] args) 
	{
		 new Child();
	}
}
