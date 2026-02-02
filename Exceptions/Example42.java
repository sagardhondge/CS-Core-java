class HDFC
{	int amountBal;
	HDFC (int amountBal)
	{	if (amountBal>=10000)
		{	this.amountBal=amountBal;
			System.out.println("Account Succesfully Created");
		}
		else
		{	throw new ArithmeticException("please Enter Valid Amount");
		}
	}
}

class Example42 
{
	public static void main(String[] args) 
	{	HDFC cust1 = new HDFC(1000);
		System.out.println("Hello World!");
	}
}
