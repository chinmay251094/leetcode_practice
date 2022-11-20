package leetCode;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNumCandies {
    public static void main(String[] args) {
        int[] candies = {2, 8, 7};
        System.out.println(kidsWithCandies(candies, 1));
    }

    private static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < candies.length; i++) {
            count = extraCandies + candies[i];
            if (count >= findMax(candies)) {
                list.add(true);
            } else {
                list.add(false);
            }
        }
        return list;
    }

    private static int findMax(int[] candies) {
        int max = 0;
        for (int i = 0; i <= candies.length - 1; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        return max;
    }
}
