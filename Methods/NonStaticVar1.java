class NonStaticVar1 
{	int a= 100;
	public static void main(String[] args) 
	{
		System.out.println("satrt @ cyber sucess");
		//System.out.println(a);
		//System.out.println(NonStaticVar1.a);
		//object
		NonStaticVar1 var1 = new NonStaticVar1();
		System.out.println(var1.a);
		System.out.println("satrt @ cyber sucess");
	}
}
