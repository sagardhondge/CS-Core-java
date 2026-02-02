class Cyber
{	public String toString()
	{	return "CyberSuccess";
	}
}
class Example5 
{
	public static void main(String[] args) 
	{	Example5 ref1 = new Example5();
		System.out.println(ref1);
		Cyber ref2 = new Cyber();//without overridden --> tosting() --> onbject --> Address
		System.out.println(ref2);
		String str1 = new String("Cyber");// with overridden --> tostring() --> Cyber --> Value
		System.out.println(str1);
	}
}
