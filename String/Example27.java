class Example27
{
	public static void main(String[] args) 
	{	String str1="Cyber";
		String str2="Cyber";
		System.out.println(str1.compareTo(str2));//case sensitive comparision
		System.out.println(str1.compareToIgnoreCase(str2));//case Insensitive comparision
		System.out.println(str1.equals(str2));//case sensitive comparision
		System.out.println(str1.equalsIgnoreCase(str2));//case Insensitive comparision
	}
}
//  public boolean equalsIgnoreCase(java.lang.String);
//  public int compareToIgnoreCase(java.lang.String);