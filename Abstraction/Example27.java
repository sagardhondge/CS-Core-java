class Flipkart implements Cloneable
{
    int flipkartId;
    String flipkartCustName;

    Flipkart(int flipkartId, String flipkartCustName)
    {
        this.flipkartId = flipkartId;
        this.flipkartCustName = flipkartCustName;
    }

    protected Object clone()
    {
        try
        {
            return super.clone();
        }
        catch (CloneNotSupportedException cs)
        {
            return this;
        }
    }
}

class Example27
{
    public static void main(String[] args)
    {
        System.out.println("Start @ Cyber Success");

        Flipkart cust1 = new Flipkart(101, "Rahul");
        Flipkart cust2 = (Flipkart) cust1.clone();

        System.out.println(cust1);
        System.out.println(cust2);
        System.out.println(cust2.flipkartId + " - " + cust2.flipkartCustName);

        System.out.println("Stop @ Cyber Success");
    }
}
