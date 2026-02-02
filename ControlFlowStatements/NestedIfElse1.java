class NestedIfElse1
{
	public static void main(String[] args) 
	{	System.out.println("Start @ Cyber Success");
		char prodName='r';
		int prodQty=34;
		if (prodName=='l')
		{	if (prodQty>25)
			{	System.out.println("Pruchase the Laptop");
			}
			else 
			{	System.out.println("Do not purchase");
			}
		}
		else 
		{	if(prodQty>10)
			{	System.out.println("Purchase the other Product");
			}
			else
			{	System.out.println("Do not purchase");
			}
		}
		System.out.println("StOP @ Cyber Success");
	}	

}
