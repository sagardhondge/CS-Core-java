package collection.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LInkedList2 {
    public static void main(String[] args) {
        LinkedList<Emp> ll1 = new LinkedList<Emp>();
        ll1.add(new Emp(101,"sagar"));
        ll1.add(new Emp(102,"Prem"));
        ll1.add(new Emp(103,"Ram"));
        Iterator<Emp> i= ll1.iterator();
        while (i.hasNext())
        {   Emp e=i.next();
            System.out.println(e.empId+"-"+e.empName);
        }
    }
}
