package collection.list;

import java.util.ArrayList;

public class ArrayList11 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add('x');al.add('y');al.add('z');
        System.out.println(al.isEmpty());
        System.out.println(al.contains('y'));
        System.out.println(al.contains('a'));
        al.clear();
        System.out.println(al.isEmpty());
    }
}
//isEmpty/contains/clear