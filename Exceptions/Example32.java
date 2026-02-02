class Example32
{	static void rtoOfficer() throws InterruptedException
	{	System.out.println("Inside Rto Officer");
		Thread.sleep(3000);
	}
	static void rtoAgent()
	{	System.out.println("Inisde rto Agent");
		rtoOffice();
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
