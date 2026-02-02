class Example13
{
	public static void main(String[] args) 
	{	StringBuffer str1 =new StringBuffer ("Cyber");
		StringBuffer str2 =new StringBuffer ("Success");
		StringBuffer str3 =new StringBuffer ("Cyber");
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
		System.out.println(str3.equals(str1));

	}
}
// StringBuffer--. it will perform the refrence comparision and calls three differnt objects