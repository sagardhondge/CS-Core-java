class Flpikart
{	void payment()
	{	System.out.println("Pay by cash");
	}
	void payment(int debit)
	{	System.out.println("Pay by Debit/Crdit Card");
	}
	void payment(String Upi)
	{	System.out.println("Pay by UPI ");
	}
	void payment(int netbankingId, String Password)
	{	System.out.println("Pay by Netbanking");
	}
}
class  Example5
{
	public static void main(String[] args) 
	{
		Flpikart cust = new Flpikart();
		cust.payment(1345);	
	}
}
