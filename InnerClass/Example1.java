class Outer
{	int a=10;
	class Inner
	{	float b=20.5f;
	}
}

class Example1 
{
	public static void main(String[] args) 
	{	//outer class object
		Outer o = new Outer();
		System.out.println(o.a);
		// Inner class object that is in the outer class and an normal inner class is bydefault nonstaic 
		Outer.Inner i = o.new Inner();// to access an inner class object we have to use  the object of outer
		// class with inner class object to load the inner class varaibles and members
		System.out.println(i.b);
	}
}
