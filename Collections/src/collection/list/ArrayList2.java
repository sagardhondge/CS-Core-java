package collection.list;

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList al1= new ArrayList();
        al1.add("Cyber");
        al1.add("Sucess");
        al1.add("trraing");
        System.out.println(al1);
        for (Object o :al1)
        {   String s=(String) o;
            System.out.println(s);
        }
    }
}
