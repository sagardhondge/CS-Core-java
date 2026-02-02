class Parent
{	Parent()
	{	System.out.println("Inside 0 arg cosnt -Parent->>");
	}
}
class Child extends Parent
{	Child()
	{	
		System.out.println("Inside 0 arg constructor -child->>");
	}
}
class Example20
{
	public static void main(String[] args) 
	{
		 new Child();
	}
}
