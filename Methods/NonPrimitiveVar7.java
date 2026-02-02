class Demo
{
static Demo ref;
float x=10.5f;
void m1()
{
	System.out.println("Inside M1 Method");
}
}


class NonPrimitiveVar7 
{
	public static void main(String[] args) 
	{
		System.out.println("Start @ Cyber Success");
		Demo.ref=new Demo();
		System.out.println(Demo.ref.x);
		Demo.ref.m1();
		System.out.println("Stop @ Cyber Success");
	}
}
