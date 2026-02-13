package collection.list;

import java.util.Comparator;

public class ZomatoCompName implements Comparator<Zomato>
{   int status;

    @Override
    public int compare(Zomato o1, Zomato o2) {
        status=o1.menuName.compareTo(o2.menuName);
        return status;
    }
}
