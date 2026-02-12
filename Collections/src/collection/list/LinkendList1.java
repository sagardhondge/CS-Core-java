package collection.list;

import java.util.LinkedList;

public class LinkendList1 {
    public static void main(String[] args) {
        LinkedList ll1= new LinkedList();
        ll1.add(100);ll1.add(200);
        System.out.println(ll1);
        ll1.add("Cyber");ll1.add("Sucess");
        System.out.println(ll1);
        ll1.add(true);ll1.add('x');ll1.add(null);
        System.out.println(ll1);
    }
}
