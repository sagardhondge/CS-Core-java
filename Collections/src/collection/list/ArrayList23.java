package collection.list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList23 {
    public static void main(String[] args) {
        ArrayList<Zomato> al = new ArrayList<Zomato>();
        al.add(new Zomato(101,"Poha"));
        al.add(new Zomato(103,"Misal"));
        al.add(new Zomato(102,"Chaval"));
        System.out.println("Before Starting");
        for ( Zomato zz:al) {
            System.out.println(zz.menuId + "--" + zz.menuName);
        }
        Collections.sort(al,new ZomatoCompId());
        System.out.println("------------");
        System.out.println("After Sorting");
        for ( Zomato zz:al)
        {
            System.out.println(zz.menuId+"--"+zz.menuName);
        }
        Collections.sort(al,new ZomatoCompName());
        System.out.println("------------");
        System.out.println("After Sorting by Name");
        for ( Zomato zz:al)
        {
            System.out.println(zz.menuId+"--"+zz.menuName);
        }
    }
}
