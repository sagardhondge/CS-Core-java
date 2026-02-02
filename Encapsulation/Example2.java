class Hdfc
{
    private int amountBal;

    Hdfc(int amountBal)
    {
        this.amountBal = amountBal;
        System.out.println("Account is Successfully Created");
    }

    public int getBalance()
    {
        System.out.println("Your request is in progress... Kindly wait");
        return amountBal;
    }

    public void setBalance(int amount)
    {
        System.out.println("Fetching your balance... in progress...");
        if (amount > 0)
        {
            amountBal = amountBal + amount;
            System.out.println("Amount Deposit is successful");
        }
        else
        {
            System.out.println("Invalid amount");
        }
    }
}

class Example2
{
    public static void main(String[] args)
    {
        Hdfc cust1 = new Hdfc(1000);

        int amountBal = cust1.getBalance();
        System.out.println("Amount balance is " + amountBal);

        cust1.setBalance(500);

        amountBal = cust1.getBalance();
        System.out.println("Amount balance is " + amountBal);
    }
}
