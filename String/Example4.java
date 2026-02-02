class Example4
{
	public static void main(String[] args) 
	{	//1Approach
		String str1 ="Cyber";
		String str2 ="Success";
		String str3 ="Cyber";
		System.out.println(str1==str2);
		System.out.println(str2==str3);
		System.out.println(str3==str1);
		//2nd Approach
		String strr1 =new String ("Cyber");
		String strr2 =new String ("Success");
		String strr3 =new String ("Cyber");
		System.out.println(strr1==strr2);
		System.out.println(strr2==strr3);
		System.out.println(strr3==strr1);
	}
}
