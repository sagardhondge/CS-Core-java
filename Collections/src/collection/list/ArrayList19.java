package collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList19 {
    public static void main(String[] args) {
        String [] s={"CYBER","SUCCESS","TRANING"};
        List list = Arrays.asList(s);
        ArrayList<String> al = new ArrayList<String>(list);
        System.out.println(al);
        for (String ss:al)
        {
            System.out.println(ss);
        }
    }
}
