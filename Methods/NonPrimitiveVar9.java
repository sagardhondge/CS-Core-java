class NonPrimitiveVar9
{	int a =100;
	NonPrimitiveVar9 refvar;
	public static void main(String[] args) 
	{
		System.out.println("Start @ Cyber Success");

		NonPrimitiveVar9 ref1= new NonPrimitiveVar9();
		ref1.refvar=new NonPrimitiveVar9();
		System.out.println(ref1.refvar.a);
		System.out.println("Stop @ Cyber Success");
	}  
}
