package collection.list;

import java.util.ListIterator;
import java.util.Vector;

public class Vector3 {
    public static void main(String[] args) {
        Vector<Swiigy> v = new Vector<>();
        v.add(new Swiigy(101,"Pizaa"));
        v.add(new Swiigy(102,"Burger"));
        v.add(new Swiigy(103,"Dosa"));
        ListIterator<Swiigy> li = v.listIterator();
        while (li.hasNext())
        {   Swiigy s=li.next();
            System.out.println(s.orderId+" - "+s.orderName);
        }
    }
}
