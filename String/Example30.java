import java.util.StringTokenizer;
class Example30 
{
	public static void main(String[] args) 
	{	String str = " This is, an example, on string, tokenizer";
		StringTokenizer st1 = new StringTokenizer(str,",");
		while (st1.hasMoreElements())
		{	System.out.println(st1.nextElement());
		}

	}
}
