class Flipkart
{	void getProdQty(int qty) // throws CurrentUnavailableException
	{	if (qty >=5 && qty<=10)
		{	System.out.println("Purchase the Product");
		}
		else
		{	throw new CurrentUnavailableException("Current Unavaible");
		}
	}
}
class Example44 
{
	public static void main(String[] args) // throws CurrentUnavailableException
	{
		Flipkart cust1 = new Flipkart();
		cust1.getProdQty(15);
	}
}
