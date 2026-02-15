package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMap2 {
    public static void main(String[] args) {
        HashMap hm1 = new HashMap();
        hm1.put(111,'x'); hm1.put(222,'y'); hm1.put(333,'z');
        System.out.println(hm1);
        Set s= hm1.keySet();// gives set values
        System.out.println(s);
        Collection c=  hm1.values();
        System.out.println(c);
    }
}
