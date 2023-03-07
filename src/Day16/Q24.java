package Day16;

import java.util.HashMap;

public class Q24 {
    public HashMap<Character, Integer> countAllCharacter(String str) {
        //TODO..
        if(str == null || str.isEmpty()) return null;

        HashMap<Character, Integer> newMap = new HashMap<>();
        for(char c : str.toCharArray())
            newMap.put(c, newMap.getOrDefault(c, 0) + 1);

        return newMap;
    }
}
