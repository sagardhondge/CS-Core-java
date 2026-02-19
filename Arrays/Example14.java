class emp {
    int empId;
    String empName;
    emp(int empId, String empName)
    {   this.empId=empId;
        this.empName=empName;
    }
}
class Example14 {
    public static void main (String [] args){
        System.out.println("Start @ cs");
        emp[] emp = new emp[5];
        emp[0]= new emp(001,"sagar");
        emp[2]= new emp(003,"Prem");
        emp[4]= new emp(005,"Vedant");
        for (emp ee : emp){
            if (ee instanceof emp)
            {   System.out.println(ee.empId+" -"+ee.empName);
            }
            else {
                System.out.println("Employee is not present");
            }
        }
        System.out.println("Stop @ cs");
    }
}
