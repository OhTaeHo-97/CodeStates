package Day16;

import java.util.ArrayList;
import java.util.Iterator;

public class Q12 {
    public int sumAllElements(ArrayList<Integer> arrayList) {
        //TODO..
        if(arrayList == null || arrayList.size() == 0) return 0;

        int sum = 0;
        Iterator<Integer> iter = arrayList.iterator();
        while(iter.hasNext())
            sum += iter.next();

        return sum;
    }
}
