import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class Scanner2
{
    public static void main(String[] args) throws FileNotFoundException
    {
        File file = new File("D:\\ScannerFile.txt");
        Scanner scan = new Scanner(file);

        while (scan.hasNext())
        {
            System.out.println(scan.next());
        }
    }
}

// ScannerFile.txt
// Scanner Class
// public Scanner(File) throws java.io.FileNotFoundException;
// public File(String pathname)
