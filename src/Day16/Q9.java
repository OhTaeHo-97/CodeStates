package Day16;

import java.util.ArrayList;
import java.util.Arrays;

public class Q9 {
    public static ArrayList<Integer> removeFromBackOfNew(ArrayList<Integer> arrayList) {
        //TODO..
        if(arrayList == null || arrayList.size() == 0) return null;

        // ArrayList<Integer> newList = new ArrayList<>(arrayList);
        ArrayList<Integer> newList = (ArrayList<Integer>)arrayList.clone();

        newList.remove(newList.size() - 1);
        return newList;
    }
}
