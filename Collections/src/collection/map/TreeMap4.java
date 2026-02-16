package collection.map;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMap4 {
    public static void main(String[] args) {
        TreeMap tm1 = new TreeMap();
        tm1.put(202, 'b');tm1.put(101, 'x');tm1.put(303, 'a');
        tm1.put(404,'d');tm1.put(505,'e');
        SortedMap sm1 = tm1.headMap(303);
        SortedMap sm2 = tm1.tailMap(303);
        TreeMap tm2 = new TreeMap(sm1);
        TreeMap tm3 = new TreeMap(sm2);
        System.out.println(tm2);
        System.out.println(tm3);
    }
}
