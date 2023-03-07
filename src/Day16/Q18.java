package Day16;

import java.util.HashMap;

public class Q18 {
    public int addOddValues(HashMap<Character, Integer> hashMap) {
        //TODO..
        if(hashMap == null) return 0;

        int sum = 0;
        for(Character key : hashMap.keySet()) {
            int value = hashMap.get(key);
            if(value % 2 == 0) sum += value;
        }

        return sum;
    }
}
