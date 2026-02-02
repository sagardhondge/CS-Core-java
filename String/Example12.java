class Example12
{
	public static void main(String[] args) 
	{	String st1 ="Cyber";
		String st2 ="Success";
		String st3 ="Cyber";
		System.out.println(st1.equals(st2));
		System.out.println(st2.equals(st3));
		System.out.println(st3.equals(st1));
		String str1 =new String ("Cyber");
		String str2 =new String ("Success");
		String str3 =new String ("Cyber");
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
		System.out.println(str3.equals(str1));

	}
}
