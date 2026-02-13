package collection.list;

import java.util.Vector;

public class Vector4 {
    public static void main(String[] args) {
        Vector v1= new Vector();
        v1.add(100); v1.add(200);v1.add(300);
        System.out.println(v1.size());
        System.out.println(v1.capacity());
        v1.add(100); v1.add(200);v1.add(300);
        v1.add(100); v1.add(200);v1.add(300);
        v1.add(100); v1.add(200);v1.add(300);
        System.out.println(v1.size());
        System.out.println(v1.capacity());
    }
}
