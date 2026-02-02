import java.util.Scanner;

class Scanner1
{
    public static void main(String[] args)
    {
        String str = "This is an example on a String";
        Scanner scan = new Scanner(str);

        while (scan.hasNext())
        {
            System.out.println(scan.next());
        }
    }
}

// public Scanner(String);
// public boolean hasNext();
// public String next();
