package Day16;

import java.util.ArrayList;

public class Q6 {
    public ArrayList<String> modifyNthElement(ArrayList<String> arrayList, int index, String str) {
        //TODO..
        if(arrayList == null || arrayList.size() == 0 || index >= arrayList.size()) return null;

        arrayList.set(index, str);
        return arrayList;
    }
}
