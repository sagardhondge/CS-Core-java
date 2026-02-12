package collection.list;

import java.util.ArrayList;

public class ArrayList12 {
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList();
        al1.add(100); al1.add(200); al1.add(300);
        System.out.println(al1);
        ArrayList al2 = new ArrayList();
        al2.addAll(al1);
        al2.add('x');al2.add('y');al2.add('z');
        System.out.println(al2);
    }
}
// one coil in another