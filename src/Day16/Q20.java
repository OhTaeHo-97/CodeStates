package Day16;

import java.util.HashMap;

public class Q20 {
    public boolean isContain(HashMap<String, Integer> hashMap, String key) {
        //TODO..
        if(hashMap == null) return false;
        return hashMap.containsKey(key);
    }
}
