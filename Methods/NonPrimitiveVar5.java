class  NonPrimitiveVar5
{	char x='a';
	static NonPrimitiveVar5 ref;
	public static void main(String[] args) 
	{
		System.out.println("Start @ cyber Success");
		ref = new NonPrimitiveVar5();
		System.out.println(ref.x);
		System.out.println("Stop @ cyber Success");		
	}
}
