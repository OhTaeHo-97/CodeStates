package Day16;

import java.util.ArrayList;

public class Q4 {
    public ArrayList<String> addLast(ArrayList<String> arrayList, String str) {
        //TODO..
        if(arrayList == null || arrayList.size() == 0) return null;

        arrayList.add(str);
        return arrayList;
    }
}
