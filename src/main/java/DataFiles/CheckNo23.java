package DataFiles;

import java.util.ArrayList;
import java.util.List;

public class CheckNo23 {
    public static void main(String[] args) {

    }

    public boolean no23(int[] nums) {
        boolean flag = false;
        List<Integer> myList = new ArrayList<>(nums.length);

        for (int ele : nums) {
            myList.add(ele);
        }

        if (myList.size() > 2) {
            return flag;
        }

        for (int i = 0; i < myList.size(); i++) {
            if (myList.contains(2) || myList.contains(3)) {
                return flag;
            } else {
                flag = true;
                return flag;
            }
        }

        return flag;
    }
}
