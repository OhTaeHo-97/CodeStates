package Day16;

import java.util.ArrayList;

public class Q2 {
    public Integer getNthElement(ArrayList<Integer> arrayList, int index) {
        //TODO..
        if(arrayList == null || arrayList.size() == 0 || index >= arrayList.size()) return null;
        return arrayList.get(index);
    }
}
