interface IciciBankAcc
{	void bankAcc();
}
interface IciciBankLaon extends IciciBankAcc
{	void BankLaon();
}
class Customer1 implements IciciBankAcc
{	public void bankAcc() { System.out.println("open Saving account"); }
}
class Customer2 implements IciciBankLaon
{	public void bankAcc() { System.out.println("open Current account"); }
	public void BankLaon() { System.out.println("get loan"); }
}
class Example18
{	public static void main(String[] args) 
	{
		System.out.println("Start @ cyber Success");
		Customer1 cust1 = new Customer1();
		cust1.bankAcc();
		Customer2 cust2 = new Customer2();
		cust2.bankAcc();
		cust2.BankLaon();
		System.out.println("Stop @ cyber Success");
	}
}