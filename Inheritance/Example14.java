class Parent
{	Parent()
	{	System.out.println("Inside 0 arg cosnt -Parent->>");
	}
	Parent(int a)
	{
		System.out.println("Inside 1 arg Constructor--> Parent")
	}
}
class Child extends Parent
{	Child()
	{	
		System.out.println("Inside 0 arg cosnt -child->>");
	}
}
class Example15 
{
	public static void main(String[] args) 
	{
		Child c= new Child();
	}
}
