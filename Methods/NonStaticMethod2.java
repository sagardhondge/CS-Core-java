class NonStaticMethod2
{	public static void main(String[] args) 
	{
		System.out.println("satrt @ cyber sucess");
		int var1 =10;
		float var2 = 20.5f;
		NonStaticMethod2 ref1 = new NonStaticMethod2();
		float result = ref1.m1(var1 , var2);
		System.out.println("The reuslt is "+ result);
		System.out.println("satrt @ cyber sucess");
	}
	float m1( int var1 , float var2)
	{	System.out.println("Inisde m1 Method");
		float result = var1 + var2;
		return result;
	}
}
