package Day16;

import java.util.HashMap;

public class Q14 {
    public HashMap<String, Integer> addKeyAndValue(HashMap<String, Integer> hashMap, String key, int value) {
        //TODO..
        if(hashMap == null) return null;

        hashMap.put(key, value);
        return hashMap;
    }
}
