import java.util.ArrayList;
import java.util.Collections;

public class Rs
{
    public static void main(String[] args) {
        ArrayList<Students> al = new ArrayList<Students>();
        al.add(new Students(1,"sagar",20.5d));
        al.add(new Students(2,"ram",22.5d));
        al.add(new Students(3,"prem",30.5d));
        al.add(new Students(4,"Vedant",49.5d));
        al.add(new Students(5,"kartik",56.5d));

        Collections.sort(al);

        System.out.println("Topper: "+ al.get(0).name+" - " + al.get(0).marks);
        System.out.println("Lowest: "
                + al.get(al.size() - 1).name
                + " - "
                + al.get(al.size() - 1).marks);
    }


}
