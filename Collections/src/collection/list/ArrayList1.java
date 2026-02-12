package collection.list;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(100);
        al.add(200);
        al.add(300);
        System.out.println(al);
        al.add(20.5f);
        al.add(true);
        System.out.println(al);
        al.add(null);
        al.add(100);al.add(true);
        System.out.println(al);
    }
}
