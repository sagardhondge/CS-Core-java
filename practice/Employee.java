class Demoo
{	String name;
	double salary;

	Demoo(String name,double salary)
	{	this.name=name;
		this.salary=salary;
	}
	void display(){
		if (salary<=0)
		{	System.out.println("Salary is invalid");
		}else{
			System.out.println("Employee Name is "+ name.toUpperCase());
			System.out.println("Salary is "+ salary);
		}
	}
}
class Employee 
{	
	public static void main(String[] args) 
	{	Demoo d = new Demoo("Sagar", -20000);
		d.display();
	}
}
