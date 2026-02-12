package collection.list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList22 {
    public static void main(String[] args) {
        ArrayList<Swiigy> al = new ArrayList<Swiigy>();
        al.add(new Swiigy(101,"piiza"));
        al.add(new Swiigy(103,"Burger"));
        al.add(new Swiigy(102,"Sandwitch"));
        for(Swiigy ss:al)
        {
            System.out.println(ss.orderId+ " - "+ss.orderName);
        }
        System.out.println("------------");
        Collections.sort(al);
        for(Swiigy ss:al)
        {
            System.out.println(ss.orderId+ " - "+ss.orderName);
        }
        System.out.println("-------------");
        for(Swiigy ss:al)
        {
            System.out.println(ss.orderId+ " - "+ss.orderName);
        }
    }
}
