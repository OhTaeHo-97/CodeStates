package Day16;

import java.util.ArrayList;

public class Q7 {
    public Integer removeFromFront(ArrayList<Integer> arrayList) {
        //TODO..
        if(arrayList == null || arrayList.size() == 0) return null;

        return arrayList.remove(0);
    }
}
