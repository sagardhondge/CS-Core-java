class Demo
{	private int a= 10;
	public int getValue()
	{	System.out.println("Iniside Get Value");
		return a;
	}
	public void setValue(int a)
	{	System.out.println("Inside Set value");
		this.a=a;
	}
}
class Example1 
{
	public static void main(String[] args) 
	{	Demo d= new Demo();
		int a = d.getValue();
		System.out.println(a);
		d.setValue(100);
		a=d.getValue();
		System.out.println(a);
	}
}
