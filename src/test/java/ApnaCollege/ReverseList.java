package ApnaCollege;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        List<Integer> userList = new ArrayList<>();
        userList.addAll(Arrays.asList(1, 2, 3, 4, 5));
        reverseList(userList);
    }

    private static void reverseList(List<Integer> list) {
        for (int index = list.size() - 1; index >= 0; index--) {
            System.out.print(list.get(index) + " ");
        }
        System.out.println();
    }
}
