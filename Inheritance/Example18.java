class Parent
{
	{	System.out.println("Inside Instace/Non-static bl0ck -> Parent");
	}
	Parent()
	{	
		System.out.println("Inside 1 arg Const--> Parent");
	}
}
class Child extends Parent
{
	{
		System.out.println("Insidie Instace/Non-static ->> child ");
	}
	Child()
	{
		System.out.println("Inside 1 arg cosnt -child->>");
	}
}
class Example18
{
	public static void main(String[] args) 
	{
		 new Child();
	}
}
