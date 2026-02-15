package collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet2 {
    public static void main(String[] args) {
        LinkedHashSet<MakeMyTrip> lhs1 = new LinkedHashSet<MakeMyTrip>();
        lhs1.add(new MakeMyTrip(101,"Manli"));
        lhs1.add(new MakeMyTrip(102,"Ladakh"));
        lhs1.add(new MakeMyTrip(103,"Jaipur"));
        lhs1.add(new MakeMyTrip(104,"Surat"));
        Iterator<MakeMyTrip> i = lhs1.iterator();
        while (i.hasNext())
        {   MakeMyTrip mmt = i.next();
            System.out.println(mmt.travelId+" - "+mmt.travelName);
        }
    }
}
