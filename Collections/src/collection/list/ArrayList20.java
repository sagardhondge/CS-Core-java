package collection.list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList20 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(200);al.add(100);al.add(300);al.add(400);
        System.out.println(al);
        Collections.sort(al);//compareTo() -> Integer
        System.out.println(al);
    }
}
