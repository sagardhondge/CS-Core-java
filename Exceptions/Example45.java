class RedBus
{	String redbusDest ="Waynad";
	void CheckBusAvailiabilty (String custDest) 
	{	if (redbusDest.equals(custDest))
		{	System.out.println("Bus is Avaliable");
		}
		else
		{	throw new NoBusFoundException();
		}
	}
}
class Example45
{
	public static void main(String[] args) 
	{
		RedBus cust1 = new RedBus();
		cust1.CheckBusAvailiabilty("Pondicerry");
	}
}
