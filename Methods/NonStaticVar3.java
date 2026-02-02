class NonStaticVar3 
{	int a= 100;

	public static void main(String[] args) 
	{
		System.out.println("satrt @ cyber sucess");
		NonStaticVar3 ref1 = new NonStaticVar3();
		NonStaticVar3 ref2 = new NonStaticVar3();
		System.out.println(ref1.a);
		System.out.println(ref2.a);
		ref1.a=100;
		ref2.a=1000;
		System.out.println(ref1.a);
		System.out.println(ref2.a);
		System.out.println("satrt @ cyber sucess");
	}
}
