class Emp
{	int empId;
	String empName;
	Emp(int empId,String empName)
	{	this.empId=empId;
		this.empName=empName;
		
	}
	void getEmpInfo()
	{
		System.out.println("EmpId id " + empId + " EmpName is " + empName );
	}
	public static void main(String[] args) 
    {
        System.out.println("Start @ Cyber Success");

        Emp em1 = new Emp(101, "Sagar");
        em1.getEmpInfo();

        Emp em2 = new Emp(102, "Prem");
        em2.getEmpInfo();   

        System.out.println("Stop @ Cyber Success");
    } 
}
