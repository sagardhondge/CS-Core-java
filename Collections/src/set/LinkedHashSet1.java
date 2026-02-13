package set;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {
    public static void main(String[] args) {
        LinkedHashSet lhs1 = new LinkedHashSet();
        lhs1.add(100); lhs1.add(200); lhs1.add(300);
        System.out.println(lhs1);
        lhs1.add('x'); lhs1.add(true);lhs1.add("Cyber");
        System.out.println(lhs1);
        lhs1.add('x'); lhs1.add(true);
        System.out.println(lhs1);
    }
}
