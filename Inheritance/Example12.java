class Parent
{	Parent()
	{	System.out.println("Inside 0 arg cosnt -Parent");
	}
}
class Child extends Parent
{	Child()
	{	super();
		System.out.println("Inside 0 arg cosnt -child");
	}
}
class Example12  
{
	public static void main(String[] args) 
	{
		Child c= new Child();
	}
}
//super -> keyword
//super()->call another constructor in the super class