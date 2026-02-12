package collection.list;

import java.util.ArrayList;

public class ArrayList18 {
    public static void main(String[] args) {
        ArrayList<Integer> al= new ArrayList<>();
        al.add(100);al.add(200);al.add(300);
        Integer [] arr =al.toArray(new Integer[al.size()]);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
