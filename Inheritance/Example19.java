class Parent
{	Parent()
	{	System.out.println("Inside 0 arg cosnt -Parent->>");
	}
}
class Child extends Parent
{
	{	
		System.out.println("Inside Instace/Nonstatic block -child->>");
	}
}
class Example19
{
	public static void main(String[] args) 
	{
		 new Child();
	}
}
