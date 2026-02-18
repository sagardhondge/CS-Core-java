class Combo3 
{	char x='s';
	void m1()
	{	System.out.println("Inside m1 method");
	}
	public static void main(String[] args) 
	{	Combo3 c = new Combo3();
		System.out.println(c.x);
		c.m1();
	}
}
