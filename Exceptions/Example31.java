class Example31
{	static void rtoOfficer()
	{	System.out.println("Inside Rto Officer");
		try
		{	Thread.sleep(3000);
			System.out.println("Things are Handled");
		}
		catch (InterruptedException ie)
		{	System.out.println("Alternate waAy to handle");
		}
	}
	static void rtoAgent()
	{	System.out.println("Inisde rto Agent");
		rtoOfficer();
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
