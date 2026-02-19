class Example19
{
    public static void main(String[] args)
    {
        System.out.println("Start @ Cyber Success");
        Object[] o = new Object[3];
        o[0] = new Emp(101, "Rahul");
        o[1] = new String("Cyber");
        o[2] = new Integer(100);
        for (Object oo : o)
        {   if (oo instanceof Emp)
            {
                Emp e1 = (Emp) oo;
                System.out.println(e1.empId + " - " + e1.empName);
            }
            else if (oo instanceof String)
            {
                String e2 = (String) oo;
                System.out.println(e2);
            }
            else if (oo instanceof Integer)
            {
                Integer e3 = (Integer) oo;
                System.out.println(e3);
            }
        }
        System.out.println("Stop @ Cyber Success");
    }
}
