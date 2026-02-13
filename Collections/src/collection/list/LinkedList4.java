package collection.list;

import java.util.LinkedList;

public class LinkedList4 {
    public static void main(String[] args) {
        LinkedList ll1 = new LinkedList();
        ll1.add(100); ll1.add(300);
        System.out.println(ll1);
        ll1.add(1,200);
        System.out.println(ll1);
        ll1.addFirst("start");
        ll1.addLast("stop");
        System.out.println(ll1);
    }
}
