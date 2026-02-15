package collection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet3 {
    public static void main(String[] args) {
        TreeSet<Flipkart> ts1 = new TreeSet<Flipkart>(new FkCompProdName());
        ts1.add(new Flipkart(101,"Lenovo"));
        ts1.add(new Flipkart(102,"Hp"));
        ts1.add(new Flipkart(103,"Dell"));
        Iterator<Flipkart> i = ts1.iterator();
        while (i.hasNext())
        {   Flipkart fk = i.next();
            System.out.println(fk.prodId+" - "+fk.prodName);
        }
    }
}
