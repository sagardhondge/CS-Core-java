import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;

class BYteStreamChannel 
{
	public static void main(String[] args) throws  FileNotFoundException , IOException
	{
		FileInputStream fis = new FileInputStream("D:\\ByteChannel.txt");
		FileOutputStream fos = new FileOutputStream("D:\\ByteDest.txt");
		int info ;
		while((info=fis.read())!=-1)
		{
		//System.out.println(info);it will give the unicode value
		System.out.print((char)info);
		fos.write(info);
		}
	}
}
// FileInputStream
// public FileInputStream(String path) throws FileNotFoundException
// public int read() throws IOException
// FileOutputStream
// public FileOutputStream(String path) throws FileNotFoundException
// public void write(int b) throws IOException