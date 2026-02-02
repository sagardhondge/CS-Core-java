class Example15
{
	public static void main(String[] args) 
	{	// stringbuffer to string conversion by using the constructor 1 apporoch
		StringBuffer str1 =new StringBuffer ("Hii Java");
		String ss1 = new String(str1);
		System.out.println(str1);
		// 2nd Approach -> uding tostring
		String ss2 =  str1.toString();
		System.out.println(ss2);		
	}
}
