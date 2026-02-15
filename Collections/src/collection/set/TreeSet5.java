package set;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet5 {

    public static void main(String[] args) {

        TreeSet ts1 = new TreeSet();

        ts1.add(200);
        ts1.add(100);
        ts1.add(300);
        ts1.add(500);
        ts1.add(400);

        System.out.println(ts1);

        SortedSet ss1 = ts1.headSet(300);
        SortedSet ss2 = ts1.tailSet(300);

        TreeSet ts2 = new TreeSet(ss1);
        System.out.println(ts2);

        TreeSet ts3 = new TreeSet(ss2);
        System.out.println(ts3);
    }
}
