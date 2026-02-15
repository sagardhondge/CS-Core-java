package set;

import java.util.Comparator;

public class FkCompProdName implements Comparator<Flipkart>
{   int status;
    public int compare(Flipkart F1, Flipkart F2)
    {   status=F1.prodName.compareTo(F2.prodName);
        return status;
    }
}
