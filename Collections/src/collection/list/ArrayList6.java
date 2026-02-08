import java.util.ArrayList;

public class ArrayList6 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        //al.add(true);Invalid data
        al.add(30);
        for (Integer i:al)
        {
            System.out.println(i);
        }
    }
}
