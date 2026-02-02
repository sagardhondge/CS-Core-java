interface Hsbc
{	void banking();
	void finance();
	void insurace();
}
class adapterClass implements Hsbc
{	public void banking() {  }
	public void finance() {  }
	public void insurace() {  }
}
class Hsbcbanking extends adapterClass
{	public void banking() {System.out.println("Banking Logic Implemented"); }
}
class Example26 
{	
	public static void main(String[] args) 
	{	System.out.println("Start @ cyber Success");
		Hsbcbanking cust1=new Hsbcbanking();
		cust1.banking();
		System.out.println("Stop @ cyber Success");
	}
}
