package collection.map;

import java.util.Comparator;

public class CompSwiigyId implements Comparator<Swiggy>
{   int Status;
    public int compare(Swiggy s1, Swiggy s2) {
        if (s1.orderid == s2.orderid)
        {   Status=0;
        } else if (s1.orderid>s2.orderid) {
            Status=1;
        } else if (s1.orderid<s2.orderid) {
            Status=-1;
        }
        return Status;
    }
}
