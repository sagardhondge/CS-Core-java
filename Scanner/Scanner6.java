import java.util.Scanner;

class Scanner6
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Num1 Value");
        int num1 = scan.nextInt();

        System.out.println("Enter Num2 Value");
        int num2 = scan.nextInt();

        int result = num1 + num2;
        System.out.println("The Result is " + result);
    }
}

// Scanner Class
// public int nextInt();
