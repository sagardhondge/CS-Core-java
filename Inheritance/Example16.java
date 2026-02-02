class Parent
{	Parent(int a)
	{
		System.out.println("Inside 1 arg Constructor--> Parent");
	}
}
class Child extends Parent
{	Child(int a)
	{	
		System.out.println("Inside 1 arg cosnt -child->>");
	}
}
class Example16 
{
	public static void main(String[] args) 
	{
		Child c= new Child();
	}
}

