package Day16;

import java.util.ArrayList;

public class Q8 {
    public String removeFromNth(ArrayList<String> arrayList, int index) {
        //TODO..
        if(arrayList == null || arrayList.size() == 0 || index >= arrayList.size()) return null;

        return arrayList.remove(index);
    }
}
