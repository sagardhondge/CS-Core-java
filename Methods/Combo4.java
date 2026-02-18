class Sample
{	boolean status=true;
	void test()
	{	System.out.println("Inside m1 method");
	}
}
class Combo4 
{
	public static void main(String[] args) 
	{	Sample s= new Sample();
		System.out.println(s.status);
		s.test();
	}
}
