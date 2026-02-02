class Parent
{	Parent()
	{	System.out.println("Inside 0 arg cosnt -Parent->>");
	}
}
class Child extends Parent
{	Child()
	{	//super();
		System.out.println("Inside 0 arg cosnt -child->>");
	}
}
class Example13  
{
	public static void main(String[] args) 
	{
		Child c= new Child();
	}
}
// the super() statements are compile by default by the compiler
