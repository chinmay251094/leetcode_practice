package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PairSum {
    public static void main(String[] args) {
        List<Integer> items = new ArrayList<>();
        items.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));
        //System.out.println(getTargetIndex(items, 4));
    }

//    private static List<Integer> getTargetSum(List<Integer> list, int target) {
//        List<Integer> pairOfSum = new ArrayList<>();
//
//        for (int outer = 0; outer < list.size(); outer++) {
//            for (int inner = outer + 1; inner < list.size(); inner++) {
//                if (list.get(outer) + list.get(inner) == target) {
//                    pairOfSum.addAll(Arrays.asList(outer, inner));
//                }
//            }
//        }
//        return pairOfSum;
//  }

    private static int getTargetIndex(List<Integer> list, int target) {
        int start = 0, end = list.size() - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (list.get(mid) == target) {
                return mid;
            }

            if (target < list.get(mid)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    private static List<Integer> getTargetSum(List<Integer> list, int target) {
        int start = 0, end = getTargetIndex(list, target);

        while (start < end) {
            if(list.get(start) + list.get(end) == target) {

            }
        }

        return null;
    }
}
