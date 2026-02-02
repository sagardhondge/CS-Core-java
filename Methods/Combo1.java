class Combo1
{	static int var1=100;
	static void m1()
	{
		System.out.println("Inside m1 Method");
	}
	public static void main(String[] args) 
	{	//Directly
		System.out.println(var1);m1();
		//Classname
		System.out.println(Combo1.var1);m1();
		//Object
		Combo1 ref = new Combo1();
		System.out.println(ref. var1);m1();
	}
}
