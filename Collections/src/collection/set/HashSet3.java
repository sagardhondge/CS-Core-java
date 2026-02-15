package collection.set;

import java.util.HashSet;

public class HashSet3 {
    public static void main(String[] args) {
        HashSet hs1 = new HashSet();
        hs1.add("Cyber"); hs1.add("Sucess");hs1.add("Training");
        System.out.println(hs1);
        HashSet hs2 = new HashSet(hs1);
        hs2.add("A");hs2.add("B"); hs2.add("C");
        System.out.println(hs2);
        HashSet hs3 = new HashSet();
        hs3.addAll(hs2);
        hs3.add(10);
        System.out.println(hs3);
    }
}
