package collection.set;

import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {
        TreeSet ts1= new TreeSet();
        ts1.add(100);ts1.add(200);ts1.add(300);
        System.out.println(ts1);
        //ts1.add(true);
        ts1.add(100);ts1.add(200);ts1.add(300);
        System.out.println(ts1);
        //ts1.add(null);
        //System.out.println(ts1);
    }
}
