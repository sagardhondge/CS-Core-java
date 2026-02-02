class Parent
{	public void m1()
	{	System.out.println("Inside m1 mwthod - Parent");
	}
}
class Child extends Parent
{	public void m1()
	{	System.out.println("Inside m1 Method - child");
	}
}
class Example26
{
	public static void main(String[] args) 
	{	Parent p = new Child();
		p.m1();	
	}
}

