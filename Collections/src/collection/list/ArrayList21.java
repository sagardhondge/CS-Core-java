package collection.list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList21 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("Lenvo"); al.add("Acer");
        al.add("Asus");  al.add("Dell");
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
    }
}
