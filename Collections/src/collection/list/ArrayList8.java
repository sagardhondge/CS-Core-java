package collection.list;

import java.util.ArrayList;

public class ArrayList8 {
    public static void main(String[] args) {
    //Generic Collection
        ArrayList<Emp> al= new ArrayList<Emp>();
        al.add(new Emp(111,"Sagar"));
        // Approach-1 using for() to extract data
        for (Emp e:al)
        {
            System.out.println(e.empId+" -"+e.empName);
        }
        // Approach-2 get()
        Emp ee = al.get(0);
        System.out.println(ee.empId+" -"+ ee.empName);
    }
}

