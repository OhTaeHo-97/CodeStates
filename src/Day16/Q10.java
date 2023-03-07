package Day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q10 {
    public List<String> arrayToArrayList(String[] arr) {
        //TODO..
        if(arr == null || arr.length == 0) return null;

        return new ArrayList<String>(Arrays.asList(arr));
    }
}
