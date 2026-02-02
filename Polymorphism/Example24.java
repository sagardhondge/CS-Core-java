class Rbi
{	void loans() 
	{	System.out.println("ROI for Loans @RBI should be 8%");
		final void processFess ()
		System.out.println("Mandatory if 1% of amount");
	}	
}
class Hdfc extends Rbi
{	void loans()	
	{	System.out.println("ROI for Loans @RBI should be 15%");
	}
}	
class Icici extends Rbi
{	void loans()	
	{	System.out.println("ROI for Loans @RBI should be 15.5%");
	}
}
class Yes extends Rbi
{
}
class Example24
{	public static void main(String[] args)
	{	Rbi cust1 = new Hdfc();
		cust1.loans();
		Rbi cust1 = new Yes();
		cust2.loans();
		Rbi cust3= new Icici()
		cust3.processFess();
	}
}