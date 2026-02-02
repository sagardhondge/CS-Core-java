class HDFC
{	int amonuntbal;
	HDFC(int amountbal)
	{	if (amountbal>10000)
	{	System.out.println("Account Created Successfully");
	}
	else
	{
		System.out.println("Invaild Amount! reenter Amount ");
	}	
	}
	
}

class Example9 
{
	public static void main(String[] args) 
	{
		System.out.println("Start @ Cyber Success");
		HDFC custacc1=new HDFC(1000);
		System.out.println("Stop @ Cyber Success");
	}
}
