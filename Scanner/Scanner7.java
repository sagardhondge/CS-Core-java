import java.util.Scanner;

class Scanner7
{
    public static void main(String[] args)
    {
        String ss = "This is a String Class";
        Scanner scan = new Scanner(ss);

        while (scan.hasNextLine())
        {
            System.out.println(scan.nextLine());
        }
    }
}

// public boolean hasNextLine();
// public java.lang.String nextLine();
