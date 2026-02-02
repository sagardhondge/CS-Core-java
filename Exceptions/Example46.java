class MMT
{	String mmtFlightDest ="Waynad";
	void CheckFlightAvailiabilty (String custDestFlight) 
	{	if (mmtFlightDest.equals(custDestFlight))
		{	System.out.println("Flight is Avaliable");
		}
		else
		{	throw new NoFlightFoundException("Flights are not Available at "+ custDestFlight);
		}
	}
}
class Example46
{
	public static void main(String[] args) 
	{
		MMT cust1 = new MMT();
		cust1.CheckFlightAvailiabilty("Pondicerry");
	}
}
