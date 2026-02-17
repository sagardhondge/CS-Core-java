class Switch11
{
	public static void main(String[] args)
	{
		int x = 126;

		switch (x)
		{
			case 126:
				System.out.println("A");
				break;

			case 127:   // changed value
				System.out.println("B");
				break;

			case 128:
				System.out.println("C");
				break;

			default:
				System.out.println("Default");
		}
	}
}
