package collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList17
{
    public static void main(String[] args)
    {
        ArrayList<Emp> al = new ArrayList<Emp>();

        al.add(new Emp(101, "Akash"));
        al.add(new Emp(202, "Nikita"));
        al.add(new Emp(303, "Pravin"));

        Iterator<Emp> i = al.iterator();
        while (i.hasNext())
        {
            Emp e = i.next();
            if (e.empName.equals("Pravin"))
            {
                i.remove();   // safe removal using Iterator
            }
        }

        for (Emp e : al)
        {
            System.out.println(e.empId + " " + e.empName);
        }
    }
}

