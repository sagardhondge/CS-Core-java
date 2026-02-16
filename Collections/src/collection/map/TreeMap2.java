package collection.map;

import java.util.Set;
import java.util.TreeMap;

public class TreeMap2 {
    public static void main(String[] args) {
        //TreeMap<Swiggy , String> tm1 = new TreeMap<Swiggy, String>(new CompSwiigyId());
        TreeMap<Swiggy , String> tm1 = new TreeMap<Swiggy, String>(new CompSwiigyName());
        tm1.put(new Swiggy(102,"Burger"),"Pune");
        tm1.put(new Swiggy(101,"Icecream"),"Bombay");
        tm1.put(new Swiggy(103,"Sandwitch"),"Latur");
        System.out.println(tm1);
        Set <Swiggy> s = tm1.keySet();
        for (Swiggy ss:s)
        {
            System.out.println(ss.orderid+" - "+ss.orderName);
        }
    }
}
