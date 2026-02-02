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
class three extends two
{	char c='s';
	void m3()
	{
		System.out.println("Indide m1 Method "+c);
	}
}

class  Example3
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
		ref3.m2();
		ref3.m1();
	}
}