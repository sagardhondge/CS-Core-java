package collection.list;

import java.util.ArrayList;

public class ArrayList9 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(100); al.add(200);
        al.add("x"); al.add(true);
        System.out.println(al);
        al.add(1,'y');
        System.out.println(al);
    }
}
