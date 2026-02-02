class Ims
{	int StudId;
	String StudName;
	static String instituteName ="Cyber Success";

	
	void setStudentInfo(int StudId,String StudName)
	{
		this.StudId=StudId;
		this.StudName=StudName;
		System.out.println("Student Info Succesfully Set");
	}
	void getStudentInfo()
	{
		System.out.println("StudId is "+ StudId +" StudName is " + StudName+" From "+instituteName);
	}
}
class Example1 
{
	public static void main(String[] args) 
	{	Ims Stud1=new Ims();
		Stud1.setStudentInfo(1,"Sagar");
		Stud1.getStudentInfo();
		Ims Stud2=new Ims();
		Stud2.setStudentInfo(2,"Prem");
		Stud2.getStudentInfo();
	}
}
