import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.ObjectOutputStream;
import java.io.IOException;

class College 
{
	public static void main(String[] args) throws FileNotFoundException , IOException
	{	//Stud StudInfo = new Stus(101,"Sagar");
		FileOutputStream fos = new FileOutputStream("D:\\StudentCollegeInfo.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(new Stud(101, "Sagar"));
	}
}
