package collection.set;

import java.util.HashSet;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet hs1 = new HashSet();
        hs1.add(200);hs1.add(100);hs1.add(300);
        System.out.println(hs1);
        hs1.add(true); hs1.add('s');hs1.add(20.5f); hs1.add(null);
        System.out.println(hs1);
        hs1.add(true); hs1.add('x');
        System.out.println(hs1);
    }
}
