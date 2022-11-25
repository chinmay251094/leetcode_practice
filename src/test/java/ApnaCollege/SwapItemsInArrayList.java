package ApnaCollege;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwapItemsInArrayList {
    public static void main(String[] args) {
        List<Integer> userList = new ArrayList<>();
        userList.addAll(Arrays.asList(1, 2, 3, 4, 5));

        swapItems(userList, 1, 3);
    }

    static void swap(List<Integer> list, int idx1, int idx2) {
        int temp = 0;

        temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    private static void swapItems(List<Integer> list, int index1, int index2) {
        System.out.println("***Before Swap***");
        System.out.println(list);

        for (int index = 0; index < list.size(); index++) {
            swap(list, index1, index2);
        }
        System.out.println("***After Swap***");
        System.out.println(list);
    }
}
