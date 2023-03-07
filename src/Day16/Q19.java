package Day16;

import java.util.HashMap;

public class Q19 {
    public static HashMap<String, String> addFullNameEntry(HashMap<String, String> hashMap) {
        //TODO..
        hashMap.put("fullName", hashMap.get("firstName") + hashMap.get("lastName"));
        return hashMap;
    }
}
