class Example33
{	static void rtoOfficer() throws InterruptedException
	{	System.out.println("Inside Rto Officer");
		Thread.sleep(3000);
	}
	static void rtoAgent()
	{	System.out.println("Inisde rto Agent");
		try
		{	rtoOfficer();
			System.out.println("Things are Handled");
		}
		catch (InterruptedException ie)
		{	System.out.println("Alternate waAy to handle");
		}
	}
	static void rtoOffice()
	{	System.out.println("Inside rto officer");
		rtoAgent();
	}
	public static void main(String[] args) 
	{
		System.out.println("Start @ cs");
		rtoOffice();
		System.out.println("Start @ cs");
	}
}
