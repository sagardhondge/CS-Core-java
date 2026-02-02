class parent
{	{
	System.out.println("inside nsb /instance block");
	}
}
class child
{	child()
	{
		System.out.println("inside 0 arg const");
	}
}

class Example20
{
    public static void main(String[] args)
    {
        new child(); 
    }
}
