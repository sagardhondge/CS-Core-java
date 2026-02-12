package collection.list;

import java.util.ArrayList;

public class ArrayList10 {
    public static void main(String[] args) {
    ArrayList al = new ArrayList();
        al.add(100); al.add(200); al.add(300);
        System.out.println(al);
        System.out.println(al.size());
        // remove by index
        al.remove(0);
        System.out.println(al);
        // remove object
        Integer i=300;
        al.remove(i);
        System.out.println(al);
    }
}
//size/remove