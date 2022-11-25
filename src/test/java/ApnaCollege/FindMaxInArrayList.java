package ApnaCollege;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMaxInArrayList {
    public static void main(String[] args) {
        List<Integer> userList = new ArrayList<>();
        userList.addAll(Arrays.asList(154, 23, 31, 49, 5));
        System.out.println(findMax(userList));
    }

    private static int findMax(List<Integer> list) {
        int max = 0;

        for (int index = 0; index < list.size(); index++) {
            if (index == 0) {
                max = list.get(index);
            }
//
//            if (list.get(index) > max) {
//                max = list.get(index);
//            }
            max = Math.max(max, list.get(index));
        }
        return max;
    }
}
