package collection.map;

import java.util.Comparator;

public class CompSwiigyName implements Comparator<Swiggy>
{   int status;
    public int compare(Swiggy s1, Swiggy s2) {
        status= s1.orderName.compareTo(s2.orderName);
        return status;
    }
}
