package DataFiles;

public class MakeLast {
    public static void main(String[] args) {
        int[] myArr = new int[]{4, 5, 6};
        new MakeLast().makeLast(myArr);
    }

    public int[] makeLast(int[] nums) {
        if (nums.length < 1) {
            int[] invalid = {0};
            return invalid;
        }

        int[] newArr = new int[nums.length * 2];

        for (int i = 0; i < newArr.length - 1; i++) {
            newArr[i] = 0;
        }

        newArr[newArr.length - 1] = nums[nums.length - 1];
        return newArr;
    }
}
