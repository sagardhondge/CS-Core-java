package collection.map;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMap3 {
    public static void main(String[] args) {
        TreeMap tm1 = new TreeMap();
        tm1.put(202, 'b');tm1.put(101, 'x');tm1.put(303, 'a');
        tm1.put(404,'d');tm1.put(505,'e');
        System.out.println(tm1);
        SortedMap sm1 = tm1.headMap(303);
        System.out.println(sm1);
        SortedMap sm2 = tm1.tailMap(303);
        System.out.println(sm2);
    }
}
