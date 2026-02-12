package collection.list;
import java.util.ArrayList;

public class ArrayList4 {
    public static void main(String[] args) {
        Emp e1 = new Emp(1001,"Sagar");
        Integer i1=100;
        String s1="Cyber Success";
        ArrayList al1 = new ArrayList();
        al1.add(e1);al1.add(i1);al1.add(s1);
        for (Object o: al1)
        {   if (o instanceof Emp)
            {   Emp ee =(Emp)o;
                System.out.println(ee.empId+" - "+ee.empName);
            } else if (o instanceof Integer)
            {   Integer i = (Integer)o;
                System.out.println(i);
            } else if (o instanceof String)
            {   String s =(String) o;
                System.out.println(s);
            }
        }
    }
}
