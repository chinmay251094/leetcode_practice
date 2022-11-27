package ApnaCollege;

import java.util.ArrayList;
import java.util.List;

public class TwoDimensionalList {
    public static void main(String[] args) {
        List<List<Integer>> pivot = new ArrayList<>();

        List<Integer> one = new ArrayList<>();
        List<Integer> two = new ArrayList<>();
        List<Integer> three = new ArrayList<>();

        for (int index = 1; index <= 10; index++) {
            one.add(index * 1);
            two.add(index * 2);
            three.add(index * 3);
        }
        pivot.add(one);
        pivot.add(two);
        pivot.add(three);

        for (int row = 0; row < pivot.size() ; row++) {
            List<Integer> current = pivot.get(row);
            for (int col = 0; col < current.size(); col++) {
                System.out.print(current.get(col)+" ");
            }
            System.out.println();
        }
    }
}
