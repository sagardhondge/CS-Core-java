import java.util.Scanner;

class Scanner5
{
    public static void main(String[] args)
    {
        String ss = "this is, an Example, to Read, from String";

        Scanner scan = new Scanner(ss);
        scan.useDelimiter(",");

        while (scan.hasNext())
        {
            System.out.println(scan.next());
        }

        scan.close();
    }
}
