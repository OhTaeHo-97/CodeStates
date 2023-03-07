package Day16;

import java.util.ArrayList;
import java.util.Arrays;

public class Q1 {
    public ArrayList<Integer> makeArrayList() {
        //TODO..
//        ArrayList<Integer> list = new ArrayList<>();
//        for(int num = 1; num <= 5; num++)
//            list.add(num);
//        return list;

//         return new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));

        Integer[] nums = {1, 2, 3, 4, 5};
        return new ArrayList<Integer>(Arrays.asList(nums));
    }
}
