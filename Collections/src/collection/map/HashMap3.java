package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap3 {
    public static void main(String[] args) {
        HashMap hm1 = new HashMap();
        hm1.put(101,"Cyber"); hm1.put(102,"Sucess"); hm1.put(103,"Training");
        System.out.println(hm1);// this only shows the map data
        // extracting  the data form the map using set and cursor by using the Entry() method
        Set s= hm1.entrySet();
        Iterator i = s.iterator();
        while (i.hasNext())
        {
            Map.Entry m = (Map.Entry)i.next();
            System.out.println(m.getKey()+" - "+m.getValue());
        }
    }
}
