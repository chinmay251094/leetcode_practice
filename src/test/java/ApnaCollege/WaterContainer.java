package ApnaCollege;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WaterContainer {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 8, 6, 2, 5, 4, 8, 3, 7));
        System.out.println(getContainerWithMostWater(list));

//        int[] containers = {1, 8, 6, 2, 5, 4, 8, 3, 7};
//        System.out.println(getContainerWithMostWater(containers));
    }

//    private static int getContainerWithMostWater(List<Integer> list) {
//        int maxWater = 0;
//        for (int row = 0; row < list.size(); row++) {
//            for (int col = row + 1; col < list.size(); col++) {
//                int height = Math.min(list.get(row), list.get(col));
//                int width = col - row;
//                int currentWater = height * width;
//                maxWater = Math.max(currentWater, maxWater);
//            }
//        }
//        return maxWater;
//    }

    private static int getContainerWithMostWater(List<Integer> list) {
        int maxWater = 0, lp = 0, rp = list.size() - 1;

        while (lp < rp) {
            int height = Math.min(list.get(lp), list.get(rp));
            int width = rp - lp;
            int currentWater = height * width;
            maxWater = Math.max(currentWater, maxWater);

            if(list.get(lp) < list.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxWater;
    }
}
