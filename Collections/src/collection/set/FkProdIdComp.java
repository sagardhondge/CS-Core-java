package set;

import java.util.Comparator;

public class FkProdIdComp implements Comparator<Flipkart>
{   int Status;
    public int compare(Flipkart f1, Flipkart f2) {
        if (f1.prodId==f2.prodId)
        {  Status=0;
        } else if (f1.prodId>f2.prodId) {
            Status=1;
        } else if (f1.prodId<f2.prodId) {
            Status=-1;
        }
        return Status;
    }
}
