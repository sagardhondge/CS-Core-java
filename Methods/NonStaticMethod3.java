class Sample
{	int m1(int x)
	{	System.out.println("Inside m1 Method");
		int result1=x+100;
		return result1;
	}
	float m2(float y)
	{	System.out.println("Inside m2 Method");
		float result2=y+200.5f;
		return result2;
	}	
}
class NonStaticMethod3 
{
	public static void main(String[] args) 
	{
		System.out.println("Start @ Cyber Success");
		int x=10;
		float y=20.5f;
		Sample s=  new Sample();
		int result1=s.m1(x);
		float result2 = s.m2(y);
		float Finalresult=result1+result2;
		System.out.println("The Resutl is "+ Finalresult);
		System.out.println("Start @ Cyber Success");
	}
}
