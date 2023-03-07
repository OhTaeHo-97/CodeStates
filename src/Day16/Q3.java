package Day16;

import java.util.ArrayList;

public class Q3 {
    public String getLastElement(ArrayList<String> arrayList) {
        //TODO..
        if(arrayList == null || arrayList.size() == 0) return null;
        return arrayList.get(arrayList.size() - 1);
    }
}
