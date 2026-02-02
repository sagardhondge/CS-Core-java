class Example19
{
    public static void main(String[] args) 
    {
        System.out.println("Start @ Cyber Success");

        int[] a = {10, 20, 30};

        try
        {
            System.out.println("Inside outer try block");

            try
            {
                System.out.println("Inside inner try block");
                System.out.println(10 / 2);
            }
            catch (ArithmeticException ae)
            {
                System.out.println("Inside inner ArithmeticException catch block");
            }

            System.out.println(a[20]); // throws ArrayIndexOutOfBoundsException
        }
        catch (ArrayIndexOutOfBoundsException ae)
        {
            System.out.println("Inside ArrayIndexOutOfBoundsException catch block: " + ae);

            try
            {
                System.out.println("Inside inner try block of catch");
                System.out.println(10 / 2);
            }
            catch (ArithmeticException ex)
            {
                System.out.println("Inside inner catch block");
            }
        }

        System.out.println("Stop @ Cyber Success");
    }
}
