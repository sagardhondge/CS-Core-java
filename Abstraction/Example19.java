interface HdfcBankAcc
{	void bankAcc();
}
interface HdfcBankLaon 
{	void BankLaon();
}
interface HdfcfreeInsurace extends HdfcBankAcc,HdfcBankLaon
{	void freeInsurace();
}
class Customer implements HdfcfreeInsurace
{	public void bankAcc() { System.out.println("Inside Saving bankaccount"); }
	public void BankLaon() { System.out.println("Inisde Personal loan"); }
	public void freeInsurace() { System.out.println("Inisde free Insurance"); }	
}
class Example19
{	public static void main(String[] args) 
	{
		System.out.println("Start @ cyber Success");
		Customer cust = new Customer();
		cust.bankAcc();
		cust.BankLaon();
		cust.freeInsurace();
		System.out.println("Stop @ cyber Success");
	}
}
