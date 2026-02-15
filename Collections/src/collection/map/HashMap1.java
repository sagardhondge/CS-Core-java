package collection.map;

import java.util.HashMap;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap hm1 = new HashMap();
        hm1.put(2,'y'); hm1.put(1,'x'); hm1.put(3,'z');
        System.out.println(hm1);
        hm1.put(10.5f,true); hm1.put("Cyber",'a');
        System.out.println(hm1);
        hm1.put(null,121);
        System.out.println(hm1);
        hm1.put(null,121);
        System.out.println(hm1);
    }
}
