package set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet2 {
    public static void main(String[] args) {
        HashSet<Flipkart> hs1 = new HashSet<Flipkart>();
        hs1.add(new Flipkart(101,"Lenovo"));
        hs1.add(new Flipkart(102,"Hp"));
        hs1.add(new Flipkart(103,"Dell"));
        Iterator<Flipkart> i = hs1.iterator();
        while (i.hasNext())
        {   Flipkart fk =i.next();
            System.out.println(fk.prodId+" - "+fk.prodName);
        }
    }
}
