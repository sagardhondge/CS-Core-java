abstract class HdfcMobileApp
{	
	abstract int checkBalance();
}
class HdfcServer extends HdfcMobileApp
{	int amountBal;
	HdfcServer(int amountBal )
	{	this.amountBal=amountBal;
		System.out.println("Account hass sucessfully Created");
	}
	int checkBalance()
		{	System.out.println("please wait we are retriving your balace");
			return amountBal;
		}	
}
class Example5
{
	public static void main(String[] args) 
	{	HdfcMobileApp cust1 = new HdfcServer(10000);
		int currentBal = cust1.checkBalance();
		System.out.println("Current Balance is "+ currentBal);
	}
}
