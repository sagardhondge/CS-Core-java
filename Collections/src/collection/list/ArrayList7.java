package collection.list;

import java.util.ArrayList;

public class ArrayList7 {
    public static void main(String[] args) {
    //Normal Collection
     ArrayList al = new ArrayList();
     al.add(new Emp(101,"Sagar"));
      // Approach-1 using for() to extract data
      for (Object o:al)
      {   Emp e =(Emp)o;
          System.out.println(e.empId+" -"+e.empName);
      }
      // Approach-2 get()
        Object oo = al.get(0);
        Emp ee =(Emp)oo;
        System.out.println(ee.empId+" -"+ ee.empName);
    }
}
