package collection.map;

import java.util.LinkedHashMap;

public class LinkedHashMap1 {
    public static void main(String[] args) {
        LinkedHashMap lhm1 = new LinkedHashMap();
        lhm1.put(2, 'y');
        lhm1.put(1, 'x');
        lhm1.put(3, 'z');
        System.out.println(lhm1);
        lhm1.put(10.5f, true);
        lhm1.put("Cyber", 'a');
        System.out.println(lhm1);
        lhm1.put(null, 121);
        System.out.println(lhm1);
        lhm1.put(null, 121);
        System.out.println(lhm1);
    }
}
