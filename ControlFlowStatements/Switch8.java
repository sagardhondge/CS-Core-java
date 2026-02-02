class Switch8 
{
	public static void main(String[] args) 
	{	char signal='y';
		switch (signal)
		{
		case 'r':System.out.println("Stop");
				break;
		case 'g':System.out.println("Go");
				break;
		case 'y':System.out.println("Slow down");
				break;
		default :System.out.println("Default");
				break;
		}
		
	}
}
