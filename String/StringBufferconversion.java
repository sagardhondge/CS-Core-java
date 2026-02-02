class StringBufferconversion
{
	public static void main(String[] args) 
	{	
		StringBuffer str1 =new StringBuffer ("Hii ");
		String string1 =  str1.toString();
		System.out.println(string1);
		String s = "Hello";
		StringBuffer sb = new StringBuffer(s);
		System.out.println(s);	
	}
}