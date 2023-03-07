package Day16;

import java.util.ArrayList;

public class Q5 {
    public ArrayList<Integer> addNth(ArrayList<Integer> arrayList, int index, int element) {
        //TODO..
        if(arrayList == null || arrayList.size() == 0 || index >= arrayList.size()) return null;

        arrayList.add(index, element);
        return arrayList;
    }
}
