package collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList15 {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add( new Swiigy(101,"Pizaa"));
        al.add( new Swiigy(102,"Burger"));
        al.add( new Swiigy(103,"Fries"));
        // Normal Cursor
        Iterator i = al.iterator();
        while (i.hasNext())
        {   Swiigy s =(Swiigy)i.next();
            System.out.println(s.orderId+" - "+ s.orderName);
        }
        //Generic Cursor
        Iterator<Swiigy> i2 =al.iterator();
        while (i2.hasNext())
        {   Swiigy s =i2.next();
            System.out.println(s.orderId+"-"+s.orderName);
        }
    }
}
