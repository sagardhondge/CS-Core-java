class Flipkart
{	void getProdStatus(boolean locstatus)
	{	if (locstatus == true)
		{	System.out.println("Do you want to Add to cart");
		}
		else
		{	throw new NotDelivarbleException();
		}
	}
}
class Example43 
{
	public static void main(String[] args) 
	{
		Flipkart cust1 = new Flipkart();
		cust1.getProdStatus(false);
	}
}
