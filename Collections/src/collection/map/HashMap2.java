package collection.map;

import java.util.HashMap;
import java.util.Set;

public class HashMap2 {
    public static void main(String[] args) {
        HashMap hs1 = new HashMap();
        hs1.put(111,'x'); hs1.put(222,'y'); hs1.put(333,'z');
        System.out.println(hs1);
        Set s= hs1.keySet();
        System.out.println(s);
    }
}
