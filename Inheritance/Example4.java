class one
{	int a=10;
	void m1()
	{
		System.out.println("Indide m1 Method "+a);
	}
}
class two extends one
{	float b=10.5f;
	void m2()
	{
		System.out.println("Indide m1 Method "+b);
	}
}
class three extends one
{	char c='s';
	void m3()
	{
		System.out.println("Indide m1 Method "+c);
	}
}
class four extends one
{	boolean d =true;
	void m4()
	{
		System.out.println("Indide m1 Method "+d);
	}
}

class  Example4
{
	public static void main(String[] args) 
	{	//parent
		one ref1 =new one();
		ref1.m1();
		System.out.println("------------------");
		//child
		two s=new two();
		s.m2();
		s.m1();	
		System.out.println("------------------");
		three ref3 =new three();
		ref3.m3();
		ref3.m1();
		System.out.println("------------------");
		four ref4 =new four();
		ref4.m4();
		ref3.m1();
	}
}