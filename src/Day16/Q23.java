package Day16;

import java.util.HashMap;

public class Q23 {
    public HashMap<String, Integer> select(String[] arr, HashMap<String, Integer> hashMap) {
        //TODO..
        if(hashMap == null) return null;

        HashMap<String, Integer> newMap = new HashMap<>();

        for(String key : arr) {
            if(hashMap.containsKey(key))
                newMap.put(key, hashMap.get(key));
        }

        return newMap;
    }
}
