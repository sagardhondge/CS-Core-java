package collection.list;

import java.util.Vector;

public class Vector2 {
    public static void main(String[] args) {
        Vector v1= new Vector();
        v1.add(100); v1.add(200);
        System.out.println(v1);
        // 1 Approach
        Vector v2= new Vector();
        v2.add('x'); v2.add('y');
        System.out.println(v2);
        Vector v3 = new Vector();
        v3.addAll(v2);
        v3.add(true); v3.add(false); v3.add(null);
        System.out.println(v3);
    }
}
