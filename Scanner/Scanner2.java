import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Scanner2
{
    public static void main(String[] args) throws FileNotFoundException
    {	File file = new File("D:\\Scanner.txt");
		Scanner scan = new Scanner(file);
		while (scan.hasNext())
		{	System.out.println(scan.next());
		}
    }
}