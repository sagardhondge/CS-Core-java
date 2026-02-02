class Switch10
{
	public static void main(String[] args) 
	{	byte x=126;
		switch (x)
		{
		case 126:System.out.println("A");
				break;
		case 127:System.out.println("B");
				break;
		case 128:System.out.println("C");
				break;
		default :System.out.println("Default");
				break;
		}
	}
}