import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;

class BufferedCharStreamChannel
{
	public static void main(String[] args)  throws FileNotFoundException , IOException
	{	FileReader fr = new FileReader("D:\\CharBufferedSource.txt");
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter("D:\\CharBufferedDest.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		int info;
		while ((info=br.read())!=-1)
		{	System.out.print((char)info);
			bw.write(info);
		}
		br.close();   
        bw.close();
	}
}

//"D:\CharBufferedSource.txt"
// FileReader class
// public FileReader(String path) throws FileNotFoundException
// BufferedReader class:-
// public BufferedReader(InputStream in)
// public int read() throws IOException

// FileWriter class
// public FileOutputStream(String path) throws FileNotFoundException
// BufferedWriter class:-
// public BufferedWriter(OutputStream out)
// public void write(int b) throws IOException