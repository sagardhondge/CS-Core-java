import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Scanner3
{
    public static void main(String[] args) throws FileNotFoundException
    {
        FileReader fr = new FileReader("D:\\CharStream.txt");
        Scanner scan = new Scanner(fr);

        while (scan.hasNext())
        {
            System.out.println(scan.next());
        }

        scan.close();   // closes FileReader automatically
    }
}

