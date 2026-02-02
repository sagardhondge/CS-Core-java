class Example7
{
	public static void main(String[] args) 
	{	Integer i1 = Integer.valueOf(100);
		System.out.println(i1);
		//System.out.println(i1.toString());//viald this to string method is printl refeence value
		int i2=i1.intValue();// its an primitive data type
		System.out.println(i2);
		//System.out.println(i1.toString()); //invalid here the it is primitve data type and not an refrence varaible so we use 5xxxxx method to print the value
	}
}
//Integer Class
//public int  XXXXXValueof();
// XXXXX -> 5x is an int ,short, long, byte,and so on ...
//another method to prtint the wrapper class 
