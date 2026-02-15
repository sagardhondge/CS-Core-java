package collection.list;

import java.util.Vector;

public class Vector7 {
    public static void main(String[] args) {
        Vector v1 = new Vector();
        v1.add(100); v1.add(200); v1.add(300);
        System.out.println(v1);
        Vector v2 = new Vector(v1);
        v2.add('x'); v2.add('y');
        System.out.println(v2);
    }
}
