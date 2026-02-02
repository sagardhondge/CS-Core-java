import java.util.Scanner;

class Scanner4
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext())
        {
            System.out.println(scan.next());
        }

        scan.close();
    }
}
