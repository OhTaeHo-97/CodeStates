package Day16;

import java.util.HashMap;
import java.util.List;

public class Q21 {
    public String getElementOfListEntry(HashMap<String, List<String>> hashMap, String key, int index) {
        //TODO..
        if(hashMap == null) return null;

        List<String> list = hashMap.getOrDefault(key, null);
        if(list == null || index >= list.size()) return null;
        return list.get(index);
    }
}
