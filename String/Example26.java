class Example26
{
	public static void main(String[] args) 
	{	String str1 ="Cyber";
		String str2 ="Cyber";
		System.out.println(str1.compareTo(str2));//0
		String s1 ="Cyber";
		String s2 ="Amber";
		System.out.println(s1.compareTo(s2));//2
		String sr1 ="Amber";
		String sr2 ="Cyber";
		System.out.println(sr1.compareTo(sr2));//-2
	}
}
//compareTo()
// public int compareTo(java.lang.Object);