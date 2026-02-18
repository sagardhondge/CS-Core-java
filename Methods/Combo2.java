class Demo
{	static float x=200.5f;
	static void test()
	{	System.out.println("Innisde test 1 Mehtod");
	}
}
class Combo2
{
	public static void main(String[] args) 
	{	System.out.println("----");
		//Classname
		System.out.println(Demo.x);
		Demo.test();
		//Object
		Demo ref = new Demo();
		System.out.println(ref.x);
		ref.test();
	}
}