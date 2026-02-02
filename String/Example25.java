class Example25
{
	public static void main(String[] args) 
	{	String str ="this is an, example on, split method" ;
		String[] ss= str.split(",");//Delimiter
		for (int i=0;i<ss.length ;i++ )
		{System.out.println(ss[i]);
		} 
	}
}
//split()