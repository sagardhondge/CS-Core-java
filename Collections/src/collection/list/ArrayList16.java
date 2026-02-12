package collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList16
{
    public static void main(String[] args)
    {
        // Generic Collection
        ArrayList<Swiigy> al = new ArrayList<Swiigy>();

        al.add(new Swiigy(101, "Pizza"));
        al.add(new Swiigy(202, "Idly/Vada"));
        al.add(new Swiigy(303, "Poha"));

        // Normal Cursor (without generic)
        Iterator i1 = al.iterator();
        while (i1.hasNext())
        {
            Swiigy s1 = (Swiigy) i1.next();
            System.out.println(s1.orderId + " " + s1.orderName);
        }

        // Generic Cursor
        Iterator<Swiigy> i2 = al.iterator();
        while (i2.hasNext())
        {
            Swiigy s2 = i2.next();
            System.out.println(s2.orderId + " " + s2.orderName);
        }
    }
}
