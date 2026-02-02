class HDFC
{	HDFC(String custName)
	{System.out.println("Saving account of "+ custName+" has been Created");}
	HDFC(String custName, String orgName)
	{System.out.println("Current Account of"+orgName + " has been created for "+ custName);}
}
class  Example9
{
	public static void main(String[] args) 
	{
		HDFC d1 = new HDFC("Sagar Dhondge");
		
	}
}
