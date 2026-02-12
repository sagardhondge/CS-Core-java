package collection.list;

import java.util.ArrayList;

public class ArrayList3 {
    public static void main(String[] args) {
        Emp emp1 = new Emp(101,"sagar");
        Emp emp2 = new Emp(102,"Prem");
        Emp emp3 = new Emp(103,"Ram");
        ArrayList al1 = new ArrayList();
        al1.add(emp1);al1.add(emp2);al1.add(emp3);
        for (Object o : al1)
        {   Emp e=(Emp)o;
            System.out.println(e.empId+" - "+e.empName);
        }
    }
}
