package collection.map;

import java.util.LinkedHashMap;

public class LinkedHashMap2 {
    public static void main(String[] args) {
        LinkedHashMap lhm1 = new LinkedHashMap(5,20.5f,false);
        lhm1.put(111,"Epson");lhm1.put(222,"Benq");lhm1.put(333,"Tonzo");
        lhm1.get(222);
        System.out.println(lhm1);
        LinkedHashMap lhm2 = new LinkedHashMap(5,20.5f,true);
        lhm2.put(444,"Mouse"); lhm2.put(555,"Keyboard"); lhm2.put(666,"Camera");
        lhm2.get(555);
        System.out.println(lhm2);
    }
}
