package collection.map;

import java.util.HashMap;

public class HashMap4 {
    public static void main(String[] args) {
        HashMap hm1 = new HashMap();
        hm1.put(111,'x'); hm1.put(222,'y');
        System.out.println(hm1);
        HashMap hm2 = new HashMap(hm1);
        hm2.put("Hp",20.5f); hm2.put("Lenovo",20.5f);
        System.out.println(hm2);
        HashMap hm3 = new HashMap();
        hm3.putAll(hm2);
        hm3.put(true,"abc"); hm3.put(false,"xyz");
        System.out.println(hm3);
    }
}
