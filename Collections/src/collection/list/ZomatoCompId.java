package collection.list;

import java.util.Comparator;

public class ZomatoCompId implements Comparator<Zomato>
{   int status;
    public int compare(Zomato o1, Zomato o2) {
        if (o1.menuId == o2.menuId){
            status=0;
        } else if (o1.menuId>o2.menuId) {
            status=1;
        } else if (o1.menuId<o2.menuId) {
            status=-1;
        }
        return status;
    }
}
