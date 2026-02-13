package collection.list;

import java.util.Vector;

public class Vector1 {
    public static void main(String[] args) {
        Vector v= new Vector();
        v.add(100); v.add(200);
        System.out.println(v);
        v.add("Cyber"); v.add(true);
        System.out.println(v);
        v.add("cyber"); v.add(true); v.add(null);
        System.out.println(v);
    }
}
