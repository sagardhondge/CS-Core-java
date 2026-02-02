class Parent
{	Parent()
	{	System.out.println("Inside 0 arg Const -> Parent");
	}
	Parent(int a)
	{	this();
		System.out.println("Inside 1 arg Const--> Parent");
	}
}
class Child extends Parent
{	Child()
	{	this(10);
		System.out.println("Insidie 0 arg const ->> child ");
	}
	Child(int a)
	{	super(20);
		System.out.println("Inside 1 arg cosnt -child->>");
	}
}
class Example17
{
	public static void main(String[] args) 
	{
		Child c= new Child(30);
	}
}
