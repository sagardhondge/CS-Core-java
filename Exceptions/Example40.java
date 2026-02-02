import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class Example40 
{	static void connectToFile() throws FileNotFoundException ,IOException
	{	FileInputStream fis= new FileInputStream("D:/sourcefile.txt"); 
		fis.read();
	}
	public static void main(String[] args) throws FileNotFoundException , IOException
	{
		System.out.println("Start @ cyber Success");
		connectToFile();
		System.out.println("Stop @ cyber Success");
	}
}
