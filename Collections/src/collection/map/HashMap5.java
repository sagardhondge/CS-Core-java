package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap5 {
    public static void main(String[] args) {
        HashMap<Swiggy,Flipkart> hm1 = new HashMap<Swiggy,Flipkart>();
        hm1.put(new Swiggy(101,"poha"), new Flipkart(111,"Lenovo"));
        hm1.put(new Swiggy(102,"pavBhaji"), new Flipkart(1112,"Hp"));
        hm1.put(new Swiggy(103,"Misal"), new Flipkart(113,"Dell"));
        System.out.println(hm1);
        Set s = hm1.entrySet();
        Iterator i= s.iterator();
        while (i.hasNext())
        {
            Map.Entry<Swiggy,Flipkart> me =(Map.Entry)i.next();
            Swiggy ss = me.getKey();
            Flipkart ff = me.getValue();
            System.out.println(ss.orderid+" - "+ss.orderName+"    === "+ff.prodId+" - "+ff.prodName);
        }
    }
}
