package BinarySearch;

import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 4, 3};
        System.out.println(checkDuplicates(arr, 3));
    }

    //method 1
//    static boolean checkDuplicates(int[] arr, int target) {
//        boolean flag = false;
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 1; j < arr.length; j++) {
//                if (arr[i] == arr[j] && i != j) {
//                    flag = true;
//                    return flag;
//                }
//            }
//        }
//        return flag;
//    }

    //method 2
    static boolean checkDuplicates(int[] arr, int target) {
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (hashSet.contains(arr[i])) {
                return true;
            }
            hashSet.add(arr[i]);
        }
        return false;
    }
}
