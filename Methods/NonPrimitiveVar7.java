class Demo
{
static Demoo ref;
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
		Demoo.ref=new Demoo();
		System.out.println(Demoo.ref.x);
		Demoo.ref.m1();
		System.out.println("Stop @ Cyber Success");
	}
}
