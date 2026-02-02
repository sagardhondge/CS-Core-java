interface AxisBankAcc
{	void bankAcc();
}
interface AxisBankLaon 
{	void BankLaon();
}
class Kyc
{	void addhar() { System.out.println("Addhar Number - 998800908877"); }
}
class Customer extends Kyc implements AxisBankAcc , AxisBankLaon
{	public void bankAcc() { System.out.println("Inside Saving bankaccount"); }
	public void BankLaon() { System.out.println("Inisde Personal loan"); }	
}
class Example20
{	public static void main(String[] args) 
	{
		System.out.println("Start @ cyber Success");
		Customer cust = new Customer();
		cust.addhar();	
		cust.bankAcc();
		cust.BankLaon();
		System.out.println("Stop @ cyber Success");
	}
}

