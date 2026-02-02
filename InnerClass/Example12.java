class Outer
{	static int a=10;
	static float b= 20.5f;
	static class Inner
	{	void m1()
		{	System.out.println("Inside M1 Method");	
			System.out.println(a+b);
		}
	}
}

class Example12 
{
	public static void main(String[] args) 
	{	Outer.Inner i = new Outer.Inner();
		i.m1();
	}
}
// we can access the static inner class members by classname and but to acess the inner class we need to acess the 
//inner class and it is nonstatic and to acess it we have to create the object of the innerclass with outer classname
// that's why we had use the Outer.Inner 
