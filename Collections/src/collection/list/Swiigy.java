package collection.list;

public class Swiigy implements Comparable
{
    int orderId;
    String orderName;
    Swiigy(int orderId, String orderName)
    {   this.orderId=orderId;
        this.orderName=orderName;
    }
    // to sort the data by number, we use this approach
    int status;
    public int compareTo(Object o) {
        Swiigy s =(Swiigy)o;
        if(orderId ==s.orderId)
        {   status=0;
        } else if (orderId>s.orderId) {
            status=1;
        } else if (orderId<s.orderId) {
            status=-1;
        }
        return status;
    }

    // if we have to sort the data by name, then we use this approach and business logic
//    int Status;
//    public int compareTo(Object O)
//    {   Swiigy S =(Swiigy) O;
//        Status=orderName.compareTo(S.orderName);
//        return Status;
//    }
}
