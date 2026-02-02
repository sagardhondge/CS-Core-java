class Hdfc
{	int amountBal;
	static
	{System.out.println("Login to establish Conection With Adhar server");	
	}
	{System.out.println("Login to verify Adhar Id & OTP");	
	}
	Hdfc(int amountBal) {
        if (amountBal >= 10000) {
            this.amountBal = amountBal;
            System.out.println("Account is Successfully Created with balance: " + this.amountBal);
        } else {
            System.out.println("Invalid Amount, Please re-enter a Valid Amount (Minimum 10,000)");
        }
    }
	void getamountBal()
	{
		System.out.println("Your Acoount Balace is "+amountBal);
	}
}
class Example6
{
	public static void main(String[] args) 
	{
		System.out.println("Start @ cyber Sucess");
		Hdfc Cust1 = new Hdfc(10000);
		Cust1.getamountBal();
		System.out.println("Stop @ cyber Sucess");
	}
}
